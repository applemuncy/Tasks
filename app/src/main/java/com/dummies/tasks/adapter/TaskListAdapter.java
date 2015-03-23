package com.dummies.tasks.adapter;
import android.support.v7.widget.*;
import android.view.*;
import android.text.*;
import com.dummies.tasks.R;
import android.widget.*;

public class TaskListAdapter
	extends RecyclerView.Adapter<TaskListAdapter.ViewHolder>
{
	static String[] fakeData = new String[]{
		"one",
		"two",
		"three",
		"four",
		"five",
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
		viewHolder.titleView.setText(fakeData[i]);
	}

	@Override
	public int getItemCount()
	{
		return fakeData.length;
	}


	static class ViewHolder extends RecyclerView.ViewHolder{
		CardView cardView;
		TextView titleView;
		public ViewHolder(CardView card){
			super(card);
			cardView= card;
			titleView=(TextView)card.findViewById(R.id.text1);
		}
	}
		
		
	
}
