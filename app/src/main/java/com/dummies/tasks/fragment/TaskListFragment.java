package com.dummies.tasks.fragment;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

import android.text.*;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.*;

import com.dummies.tasks.R;
import com.dummies.tasks.adapter.*;
import android.util.*;

public class TaskListFragment extends Fragment
{
	RecyclerView recyclerView;
	TaskListAdapter adapter;
	public static String TAG="TaskListFragment";
	public TaskListFragment()
	{}

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate working");
		adapter = new TaskListAdapter();
	}


	@Override
	public View onCreateView(LayoutInflater inflater,
							 ViewGroup container,
							 Bundle savedInstanceState)
	{
		Log.d(TAG, "onCreateView working");
		final View v =inflater.inflate(R.layout.fragment_task_list,
									   container,
									   false);

		recyclerView = (RecyclerView) v.findViewById(R.id.recycler);
		recyclerView.setAdapter(adapter);
		recyclerView.setHasFixedSize(true);
		recyclerView.setLayoutManager(
			new LinearLayoutManager(getActivity()));
		Log.d(TAG, "onCreateView finishing");
		return v;

	}


}
