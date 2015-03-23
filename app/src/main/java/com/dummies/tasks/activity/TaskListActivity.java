package com.dummies.tasks.activity;

import android.app.*;
import android.os.*;
import android.widget.*;
import com.dummies.tasks.R;
import android.util.*;


public class TaskListActivity extends Activity 
{
	public static String TAG ="TaskListActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        try{
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate working");
        setContentView(R.layout.activity_task_list);
	    setActionBar((Toolbar) findViewById(R.id.toolbar));
		Log.d(TAG, " onCreate finiushing");
		}catch(Exception e){
			Log.d(TAG, e.toString());
		}
    }
}
