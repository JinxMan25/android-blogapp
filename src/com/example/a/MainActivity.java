package com.example.a;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	int counter;
	Button add, sub;
	TextView display;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		add = (Button) findViewById(R.id.bAdd);
		sub = (Button) findViewById(R.id.bSub);
		display = (TextView) findViewById(R.id.tvLol);
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			counter++; 
			display.setText("Your number is now " + counter);
				
			}
		});
		sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
			counter--;
			display.setText("Your number is now " + counter);
				
			}
		});
	}
}
