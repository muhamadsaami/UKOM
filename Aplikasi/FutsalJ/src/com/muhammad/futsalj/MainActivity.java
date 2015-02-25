package com.muhammad.futsalj;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TabHost tabhost = getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		intent = new Intent().setClass(this, BookingActivity.class);
		spec = tabhost.newTabSpec("activitybooking").setIndicator("Booking",null).setContent(intent);
		tabhost.addTab(spec);
		
		intent = new Intent().setClass(this,GalleryActivity.class);
		spec = tabhost.newTabSpec("activitygalerry").setIndicator("Gallery",null).setContent(intent);
		tabhost.addTab(spec);
		
		intent = new Intent().setClass(this,TentangActivity.class);
		spec = tabhost.newTabSpec("activitytentang").setIndicator("Tentang",null).setContent(intent);
		tabhost.addTab(spec);
	}

}
