package com.example.graficador;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import java.math.*;


@SuppressLint("NewApi")
public class GraficasMainActivity extends ActionBarActivity implements OnClickListener {
	EditText inicio, fin;
	Button graficar;
	double ini,finales;
	String inicial, ultimo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_graficas_main);
		inicio = (EditText) findViewById(R.id.ETinicial);
		fin = (EditText) findViewById(R.id.ETfinal);
		graficar = (Button) findViewById(R.id.BTgraficar);
		graficar.setOnClickListener(this);
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.graficas_main, menu);
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

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int inicioint,finint;
		inicioint= Integer.parseInt(inicio.getText().toString());
		finint= Integer.parseInt(fin.getText().toString());
		setContentView(new Dibujar(this,inicioint,finint));
	
	}
}
