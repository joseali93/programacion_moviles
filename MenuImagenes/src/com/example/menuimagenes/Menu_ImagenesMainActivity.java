package com.example.menuimagenes;

import android.support.v7.app.ActionBarActivity;

import java.io.IOException;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

@SuppressLint("NewApi")
public class Menu_ImagenesMainActivity extends ActionBarActivity implements OnClickListener {
	ImageView D1,D2,D3,D4,D5,ivgeneral;
	Button fondo;
	int movil;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu__imagenes_main);
		D1 =(ImageView) findViewById(R.id.IV1);
		D2 =(ImageView) findViewById(R.id.IV2);
		D3 =(ImageView) findViewById(R.id.IV3);
		D4 =(ImageView) findViewById(R.id.IV4);
		D5 =(ImageView) findViewById(R.id.IV5);
		ivgeneral = (ImageView) findViewById(R.id.IVGeneral);
		fondo = (Button) findViewById(R.id.BTWallpaper);
		D1.setOnClickListener(this);
		D2.setOnClickListener(this);
		D3.setOnClickListener(this);
		D4.setOnClickListener(this);
		D5.setOnClickListener(this);
		fondo.setOnClickListener(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu__imagenes_main, menu);
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

	@SuppressWarnings("deprecation")
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.IV1:
			ivgeneral.setImageResource(R.drawable.dibujo1);
			movil = R.id.IV1;
			break;
		case R.id.IV2:
			ivgeneral.setImageResource(R.drawable.dibujo2);
			movil = R.id.IV2;
			break;
		case R.id.IV3:
			ivgeneral.setImageResource(R.drawable.dibujo3);
			movil = R.id.IV3;
			break;
		case R.id.IV4:
			ivgeneral.setImageResource(R.drawable.dibujo4);
			movil = R.id.IV4;
			break;
		case R.id.IV5:
			ivgeneral.setImageResource(R.drawable.dibujo5);
			movil = R.id.IV5;
			break;
		case R.id.BTWallpaper:
			
			Bitmap imagen = BitmapFactory.decodeStream(getResources().openRawResource(movil));
			try {

				getApplicationContext().setWallpaper(imagen);
			}catch(IOException e){
				e.printStackTrace();
			}
			break;
			}
		}
		
	}

