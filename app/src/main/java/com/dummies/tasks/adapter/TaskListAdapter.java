package com.dummies.tasks.adapter;
import android.support.v7.widget.*;
import android.view.*;
import android.text.*;
import com.dummies.tasks.R;
import android.widget.*;
import android.content.*;
import com.squareup.picasso.*;

public class TaskListAdapter
	extends RecyclerView.Adapter<TaskListAdapter.ViewHolder>
{
	static String[] fakeData = new String[]{
		"one",
		"two",
		"three",
		"four",
		"five",
		"six",
		"seven",
		"eight",
		"nine",
		"ten",
        "eleven",
        "twelve",
         "thirteen",
            "fourteen",
            "fifteen",

		"Ah...ah...ah!"
	};


	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int i){
		CardView v = (CardView) LayoutInflater.from(parent.getContext())
		.inflate(R.layout.card_task, parent, false);
		return new ViewHolder(v);
	}

	@Override
	public void onBindViewHolder(ViewHolder viewHolder, int i)
	{
		Context context = viewHolder.imageView.getContext();
		viewHolder.titleView.setText(fakeData[i]);
		viewHolder.textView.setText("just some text");
		Picasso.with(context)
		.load(getImageUrlForTask(i))
		.into(viewHolder.imageView);
	}

	@Override
	public int getItemCount()
	{
		return fakeData.length;
	}

	public static String getImageUrlForTask(int taskId){
		return "http://lorempixel.com/600/400/cats/?fakeId=" + taskId;
	}

	static class ViewHolder extends RecyclerView.ViewHolder{
		CardView cardView;
		TextView titleView;
		ImageView imageView;
		TextView textView;
		public ViewHolder(CardView card){
			super(card);
			cardView= card;
			titleView=(TextView)card.findViewById(R.id.text1);
			imageView = (ImageView)card.findViewById(R.id.image);
			textView= (TextView)card.findViewById(R.id.text2);
		}
	}
		
		
	
}
