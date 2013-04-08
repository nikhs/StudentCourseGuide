package com.dnjk.studentcourseguide;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Cgpa_input extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cgpa_input);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cgpa_input, menu);
		return true;
	}

}
