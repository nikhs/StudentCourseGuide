package com.dnjk.studentcourseguide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Cgpa_main extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cgpa_main);
		
		Button cgpa = (Button)findViewById(R.id.cgpa_main_update);
		cgpa.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i=getIntent();
				i = new Intent(getApplicationContext(),Cgpa_input.class);
				startActivity(i);
			}
		});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cgpa_main, menu);
		return true;
	}
	

}
