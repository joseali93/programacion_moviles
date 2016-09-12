package com.example.gps;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.pm.ActivityInfo;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

@SuppressLint("NewApi")
public class GPSMainActivity extends Activity {
	TextView tvmensaje=null;
	ProgressDialog pd=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gpsmain);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		
		tvmensaje = (TextView) findViewById(R.id.TVmensaje);
		//pd = new ProgressDialog(this);
		
		//spd=ProgressDialog.show(GPSMainActivity.this, "Posicionando", "Esperando posicion del GPS...",true,true);

		configuraGPS();

	}

	public void configuraGPS() {
		// TODO Auto-generated method stub
		LocationManager locman;
    	LocationListener loclis;
    	locman= (LocationManager) getSystemService(LOCATION_SERVICE);
    	loclis=new 	MyLocationListener();
    	locman.requestLocationUpdates(LocationManager.GPS_PROVIDER, 500, 10, loclis);
    }
	public void muestraMensaje(Location l) {

    	String sMensaje="Longitud= "+String.valueOf(l.getLongitude())+"\nLatitud= "+String.valueOf(l.getLatitude());
    	tvmensaje.setText(sMensaje);	
    	
    	//pd.dismiss();
    }
    
    private class MyLocationListener implements LocationListener {

		@Override
		public void onLocationChanged(Location location) {
			// TODO Auto-generated method stub
			muestraMensaje(location);
		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onProviderEnabled(String provider) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onProviderDisabled(String provider) {
			// TODO Auto-generated method stub
			
		}

    }	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gpsmain, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
