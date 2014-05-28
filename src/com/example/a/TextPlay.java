package com.example.a;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.edittext);
		Button chkcmd = (Button) findViewById(R.id.bResult);
		final ToggleButton whate = (ToggleButton) findViewById(R.id.toggleButton);
		final TextView tV = (TextView) findViewById(R.id.bInvalid);
		final EditText editT = (EditText) findViewById(R.id.et);
		whate.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(whate.isChecked()){
				editT.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);	
				}else{
					editT.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});
	   chkcmd.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			String heck = editT.getText().toString();
			if(heck.contentEquals("Right")){
				tV.setGravity(Gravity.RIGHT);
			}else if(heck.contentEquals("Left")){
				tV.setGravity(Gravity.LEFT);
			}else if(heck.contentEquals("Center")){
				tV.setGravity(Gravity.CENTER);
			}else if(heck.contentEquals("blue")){
				
			}
				
			
		}
	});
	
	
	
	}

}
