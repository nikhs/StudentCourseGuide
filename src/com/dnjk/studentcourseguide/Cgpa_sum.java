package com.dnjk.studentcourseguide;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class Cgpa_sum extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cgpa_sum);
		String fin;
		float x,y=0;
		Intent b=getIntent();
		fin=b.getStringExtra(Cgpa_input.EXTRA_MESSAGE);
		TextView cp=(TextView)findViewById(R.id.cgpa_value);
		//=Float.toString(x);
		cp.setText(fin);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cgpa_sum, menu);
		return true;
	}
	
}
