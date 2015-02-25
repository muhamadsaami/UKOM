package com.muhammad.futsalj;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import org.json.JSONException;
import org.json.JSONObject;


import android.app.Activity;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class BookingActivity extends Activity {
private ProgressDialog pDialog;
JSONParser jParser = new JSONParser();

EditText editText1 , editText2 , editText3, editText4, editText5, editText6, editText7, editText8, editText9;
Button button1;
private static final String BOOKING = "http://192.168.1.182/futsal/get_booking.php";
private static final String TAG_SUCCESS = "success";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		  super.onCreate(savedInstanceState);
		  setContentView(R.layout.activitybooking);
		  
		  editText1 = (EditText) findViewById(R.id.editText1);
		  editText2 = (EditText) findViewById(R.id.editText2);
		  editText3 = (EditText) findViewById(R.id.editText3);
		  editText4 = (EditText) findViewById(R.id.editText4);
		  editText5 = (EditText) findViewById(R.id.editText5);
		  editText6 = (EditText) findViewById(R.id.editText6);
		  editText7 = (EditText) findViewById(R.id.editText7);
		  editText8 = (EditText) findViewById(R.id.editText8);
		  editText9 = (EditText) findViewById(R.id.editText9);
		  button1 = (Button) findViewById(R.id.button1);
		  button1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				new CreateBooking().execute();
				
			}
		});
	}
	class CreateBooking extends AsyncTask<String, String, String>
	{

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			pDialog = new ProgressDialog(BookingActivity.this);
			pDialog.setMessage("Mengirim data booking...");
			pDialog.setIndeterminate(false);
			pDialog.setCancelable(true);
			pDialog.show();
			
		}
	


		@Override
		protected String doInBackground(String... args) {
			String nama = editText1.getText().toString();
			String hp = editText2.getText().toString();
			String tglmain = editText3.getText().toString();
			String mulai = editText6.getText().toString();
			String berakhir = editText7.getText().toString();
			String kota = editText4.getText().toString();
			String tempat = editText5.getText().toString();
			String type = editText8.getText().toString();
			String email = editText9.getText().toString();
						
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			
			params.add(new BasicNameValuePair("nama", nama));
			params.add(new BasicNameValuePair("tglmain", tglmain));
			params.add(new BasicNameValuePair("mulai", mulai));
			params.add(new BasicNameValuePair("berakhir", berakhir));
			params.add(new BasicNameValuePair("hp", hp));
			params.add(new BasicNameValuePair("type", type));
			params.add(new BasicNameValuePair("kota", kota));
			params.add(new BasicNameValuePair("tempat", tempat));
			params.add(new BasicNameValuePair("email", email));

			JSONObject json = jParser.makeHTTPRequest(BOOKING, "POST", params);
			
			Log.d("Create Response", json.toString());
			try {
				int success = json.getInt(TAG_SUCCESS);
				
				if(success == 1){
					Intent i = new Intent(getApplicationContext(),MainActivity.class);
					startActivity(i);
					
					finish();
				}
				else {
				}
			} catch (JSONException e) {
				e.printStackTrace();
				}
			return null;
			}
		protected void onPostExecute(String file_url){
			pDialog.dismiss();
		}
		}
  
	// Pindah form dengan button
	@SuppressWarnings("unused")
	public void onClick (View v)
	{
		switch (v.getId()) {
		case R.id.button2:
			startActivity(new Intent(BookingActivity.this, InfoActivity.class));
			finish();
			break;

		default:
			break;
		}
	
	
	button1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			String noTelp = editText2.getText().toString();
			
			String pesan = "Booking Berhasil";
			
			if (editText2.length()>0) {
				KirimSMS(noTelp, pesan);
			} else {
				Toast.makeText(getBaseContext(), "Silahkan isi no HP terlebih dahulu", Toast.LENGTH_SHORT).show();
				return;
			}
		}
	});
}


private void KirimSMS(String noTelp, String pesan) {
	String SENT = "SMS_SENT";
	String DELIVERED = "SMS_DELIVERED";
	
	PendingIntent sendPI = PendingIntent.getBroadcast(this, 0, new Intent(SENT), 0);
	PendingIntent deliveredPI = PendingIntent.getBroadcast(this, 0, new Intent(DELIVERED), 0);
	
	registerReceiver(new BroadcastReceiver() {
					
		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			switch (getResultCode()) {
			case Activity.RESULT_OK:
				Toast.makeText(getBaseContext(), "SMS terkirim", Toast.LENGTH_SHORT).show();
				break;
				
			case android.telephony.SmsManager.RESULT_ERROR_GENERIC_FAILURE:
				Toast.makeText(getBaseContext(), "error", Toast.LENGTH_SHORT).show();
				break;
			
			case android.telephony.SmsManager.RESULT_ERROR_NO_SERVICE:
				Toast.makeText(getBaseContext(), "Tidak Ada Sinyal", Toast.LENGTH_SHORT).show();
				break;
			
			case android.telephony.SmsManager.RESULT_ERROR_NULL_PDU:
				Toast.makeText(getBaseContext(), "Null PDU", Toast.LENGTH_SHORT).show();
				break;
				
			case android.telephony.SmsManager.RESULT_ERROR_RADIO_OFF:
				Toast.makeText(getBaseContext(), "GSM Mati", Toast.LENGTH_SHORT).show();
				break;
		
			}
		}
	}, new IntentFilter(SENT));

	registerReceiver(new BroadcastReceiver() {
		@Override
		public void onReceive(Context context, Intent intent) {
			// TODO Auto-generated method stub
			switch (getResultCode()) {
			case Activity.RESULT_OK:
				Toast.makeText(getBaseContext(), "SMS delivered", Toast.LENGTH_SHORT).show();
				break;
				
			case Activity.RESULT_CANCELED:
				Toast.makeText(getBaseContext(), "SMS not delivered", Toast.LENGTH_SHORT).show();
				break;
						
			}
		}
	}, new IntentFilter(DELIVERED));
	
	android.telephony.SmsManager sms = android.telephony.SmsManager.getDefault();
	sms.sendTextMessage(noTelp, null, pesan, sendPI, deliveredPI);
}
}


