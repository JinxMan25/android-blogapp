package com.example.a;

import com.example.a.R.raw;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Splash extends Activity {
Thread timer;
MediaPlayer ourSong;
boolean mainactivitySUSPENDED = true;

LinearLayout what;

	@Override
	protected void onCreate(Bundle Samiloveschicken) {
		// TODO Auto-generated method stub
		super.onCreate(Samiloveschicken);
		setContentView(R.layout.splashscreen);
		ourSong = MediaPlayer.create(Splash.this, R.raw.splashsound);
		ourSong.start();
		
		  Thread timer = new Thread(){
			public void run(){
				try{
				sleep(6500);							
			    }catch (InterruptedException e){
					e.printStackTrace();
				}		
				finally{
					if(mainactivitySUSPENDED){
						Intent openMainActivity = new Intent(Splash.this, Menu.class);
						Splash.this.startActivity(openMainActivity);
						Splash.this.finish();
						overridePendingTransition(R.anim.mainfadein, R.anim.splashfadeout);
						
					} 
					
				}
			}
		};
		timer.start();
		what = (LinearLayout) findViewById(R.id.imageButton1);
		what.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
					mainactivitySUSPENDED = false;
					Intent intentmain = new Intent(Splash.this, Menu.class);
					Splash.this.startActivity(intentmain);
					Splash.this.finish();
					overridePendingTransition(R.anim.mainfadein, R.anim.splashfadeout);
			
		
	}	
		});
	}
	
		
	protected void onPause() {
		// TODO Auto-generated method stub
		ourSong.release();
		super.onPause();
		finish();
	}


		}
