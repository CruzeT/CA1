package com.example.ca;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.os.Build;

public class MainActivity extends Activity {
	
	private ImageView iView1,iView2,iView3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		iView1= (ImageView) findViewById(R.id.iView1);
		iView2= (ImageView) findViewById(R.id.iView2);
		iView3= (ImageView) findViewById(R.id.iView3);
		
		iView1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(iView1!=null){
					iView1.setBackgroundDrawable(null);
				}
				iView1.setBackgroundResource(R.drawable.ic_launcher);
				iView2.setBackgroundDrawable(null);
				iView3.setBackgroundDrawable(null);
				
			}
		});
		iView2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(iView2!=null){
					iView2.setBackgroundResource(0);
				}
				iView2.setBackgroundResource(R.drawable.ic_launcher);
				iView1.setBackgroundResource(0);
				iView3.setBackgroundResource(0);
				
			}
		});
		iView3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(iView3!=null){
					iView3.setBackgroundResource(0);
				}
				iView3.setBackgroundResource(R.drawable.ic_launcher);
				iView2.setBackgroundResource(0);
				iView1.setBackgroundResource(0);
				
			}
		});
		
	}
}
