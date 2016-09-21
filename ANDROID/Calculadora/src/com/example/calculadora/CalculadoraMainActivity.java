package com.example.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

@SuppressLint("NewApi")
public class CalculadoraMainActivity extends ActionBarActivity {
	double operando1=0,operando2=0,resultado=0;
	int operacion=0;
	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt0,btc,btsuma,btresta,btmulti,btdivi,btigual;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculadora_main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		bt0 =(Button) findViewById(R.id.BT0);
		bt1 =(Button) findViewById(R.id.BT1);
		bt2 =(Button) findViewById(R.id.BT2);
		bt3 =(Button) findViewById(R.id.BT3);
		bt4 =(Button) findViewById(R.id.BT4);
		bt5 =(Button) findViewById(R.id.BT5);
		bt6 =(Button) findViewById(R.id.BT6);
		bt7 =(Button) findViewById(R.id.BT7);
		bt8 =(Button) findViewById(R.id.BT8);
		bt9 =(Button) findViewById(R.id.BT9);
		btc =(Button) findViewById(R.id.BTC);
		btsuma =(Button) findViewById(R.id.SUMA);
		btresta =(Button) findViewById(R.id.MENOS);
		btmulti =(Button) findViewById(R.id.MULTI);
		btdivi =(Button) findViewById(R.id.DIVISION);
		btigual =(Button) findViewById(R.id.IGUAL);
		btsuma.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btsuma();
			}
		});
		btresta.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btresta();
			}
		});
		btmulti.setOnClickListener(new View.OnClickListener() {
	
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btmulti();
			}
		});
		btdivi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btdivi();
			}
		});
		btigual.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btigual();
			}
		});
		bt0.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt0();
			}
		});
		bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt1();
			}
		});
		bt2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt2();
			}
		});
		bt3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt3();
			}
		});
		bt4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt4();
			}
		});
		bt5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt5();
			}
		});
		bt6.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt6();
			}
		});
		bt7.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt7();
			}
		});
		bt8.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt8();
			}
		});
		bt9.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				bt9();
			}
		});
		btc.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				btc();
			}
		});
		
	}

	protected void btigual() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			operando2 = Double.parseDouble(calculadoraEditTextString);
			switch (operacion)
			{
			case 1: 
			resultado = (operando1 + operando2);
			break;
			case 2: 
			resultado = (operando1 - operando2);
			break;
			case 3: 
			resultado = (operando1 * operando2);
			break;
			case 4: 
			resultado = (operando1 / operando2);
			break;
			case 5: 
			resultado = Math.pow(operando1, operando2);
			break;
			}
			calculadoraEditTextString = String.valueOf(resultado); 
			operacion = 0;
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
			}

	

	protected void btdivi() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			operando1 = Double.parseDouble(calculadoraEditTextString);
			operacion = 4;
			calculadoraEditTextString = "0"; 
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}

	protected void btmulti() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			operando1 = Double.parseDouble(calculadoraEditTextString);
			operacion = 3;
			calculadoraEditTextString = "0"; 
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}

	protected void btresta() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			operando1 = Double.parseDouble(calculadoraEditTextString);
			operacion = 2;
			calculadoraEditTextString = "0"; 
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}

	protected void btsuma() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			operando1 = Double.parseDouble(calculadoraEditTextString);
			operacion = 1;
			calculadoraEditTextString = "0"; 
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}

	public void btc() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			calculadoraEditTextString = "0";
			operando1 = 0;
			operando2 = 0;
			operacion = 0;
			resultado = 0;
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}

	public void bt0() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "0";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "0";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
		
	}
	public void bt1() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "1";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "1";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
		
	}
	public void bt2() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "2";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "2";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	public void bt3() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "3";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "3";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	public void bt4() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "4";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "4";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	public void bt5() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "5";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "5";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	public void bt6() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "6";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "6";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	public void bt7() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "7";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "7";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	public void bt8() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "8";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "8";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}
	public void bt9() {
		// TODO Auto-generated method stub
		try {
			EditText calculadoraEditText = (EditText) findViewById(R.id.Calculo);
			String calculadoraEditTextString = calculadoraEditText.getText().toString();
			if (calculadoraEditTextString.equalsIgnoreCase("0") == true)
			{
			calculadoraEditTextString = "9";
			}
			else
			{
			calculadoraEditTextString = calculadoraEditTextString + "9";
			}
			calculadoraEditText.setText(calculadoraEditTextString);
			} catch (Exception ex) {
			ex.printStackTrace();
			}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculadora_main, menu);
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
