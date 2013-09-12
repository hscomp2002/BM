package com.gcom.bm;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	ImageButton lightButton,fireButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void addListenerOnButton() {
		 
		lightButton = (ImageButton) findViewById(R.id.lightButton);
		lightButton.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			   Toast.makeText(MainActivity.this,
				"Lights is clicked!", Toast.LENGTH_SHORT).show();
 
			}
 
		});
		fireButton = (ImageButton) findViewById(R.id.fireButton);
		fireButton.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
			   Toast.makeText(MainActivity.this,
				"Fires is clicked!", Toast.LENGTH_SHORT).show();
 
			}
 
		});
 
	}
}
