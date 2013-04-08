package com.dnjk.studentcourseguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Event_main extends Activity {

	Intent i = getIntent();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_event_main);
	
		Button create = (Button)findViewById(R.id.event_main_create);
		create.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
	
				i = new Intent(getApplicationContext(), Event_edit.class);
				startActivity(i);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.event_main, menu);
		return true;
	}

}
