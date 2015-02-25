package com.muhammad.futsalj;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends Activity {

	/* kode untuk menampilkan splash screen salama 5 detik */
	private final int SPLASH_DISPLAY_LENGHT = 5000;


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		/* layout splashscreen dengan background gambar */
		setContentView(R.layout.activitysplash);
	/* handler untuk menjalankan splashscreen selama 5 detik lalu 
	 * membuat HomeActivity 
	 */
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				Intent mainIntent = null;

				mainIntent = new Intent(SplashActivity.this,MainActivity.class);

				SplashActivity.this.startActivity(mainIntent);
				SplashActivity.this.finish();
			}
		}, SPLASH_DISPLAY_LENGHT);
	}
}