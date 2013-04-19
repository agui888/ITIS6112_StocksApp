package com.example.stocksapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class TopPickoftheDayActivity extends Activity {
	Intent intent;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_top_pickofthe_day);
		
		final String companyName = "";
		
		Button btnHome = (Button)findViewById(R.id.button1);
		btnHome.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				intent = new Intent(getBaseContext(), MainActivity.class);
				finish();
				startActivity(intent);
				
			}
		});
		
		Button btnCompany = (Button)findViewById(R.id.button2);
		btnCompany.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				intent = new Intent(getBaseContext(), CompanyActivity.class);
				intent.putExtra("Company", companyName);
				finish();
				startActivity(intent);
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.top_pickofthe_day, menu);
		return true;
	}

}