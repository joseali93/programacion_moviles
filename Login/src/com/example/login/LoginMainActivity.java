package com.example.login;

import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import com.example.login.BDHelper;

@SuppressWarnings("deprecation")
@SuppressLint("NewApi")
public class LoginMainActivity extends ActionBarActivity implements OnClickListener {
	Button adicionar,consultar;
	BDHelper bdh;
	SQLiteDatabase sqLiteBD;
    EditText etNick, etCorreo;
    ListView lvconsulta1,lvconsulta2;
    ArrayAdapter<String> AdapterConsulta;
	List<String> Listconsulta,lvcon;
	String scon ="SELECT * FROM jugador;";
	ArrayList<String> lista = new ArrayList<String>();
	ArrayList<String> lista2 = new ArrayList<String>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login_main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		adicionar = (Button) findViewById(R.id.BTAdicionar);
		consultar = (Button) findViewById(R.id.BTConsulta);
		etNick = (EditText) findViewById(R.id.ETNick);
	    etCorreo = (EditText) findViewById(R.id.ETCorreo);
	    bdh = new BDHelper(this);
        sqLiteBD=bdh.getWritableDatabase();
        adicionar.setOnClickListener(this);
        consultar.setOnClickListener(this);
        lvconsulta1 = (ListView) findViewById(R.id.LVConsulta1);
        lvconsulta2 = (ListView) findViewById(R.id.LVConsulta2);
        
        AdapterConsulta = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lista);
        AdapterConsulta.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
        lvconsulta1.setAdapter(AdapterConsulta);
        
        
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login_main, menu);
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
		
		if ( v.getId() ==R.id.BTAdicionar) {
			ContentValues cv = new ContentValues();
	        cv.put("Nick", etNick.getText().toString());
	        cv.put("Correo", etCorreo.getText().toString());
	        sqLiteBD.insert("jugador", null, cv);
	       
	        
		}
		if(v.getId() ==R.id.BTConsulta){
			
			Cursor cursor = sqLiteBD.rawQuery(scon, null);

			if(cursor.moveToFirst()){
				do{
					lista.add(cursor.getString(0));
					lista2.add(cursor.getString(1));
				}while(cursor.moveToNext());
			}
			
			AdapterConsulta = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lista);
	        AdapterConsulta.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
	        lvconsulta1.setAdapter(AdapterConsulta);
	        AdapterConsulta = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lista2);
	        AdapterConsulta.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
	        lvconsulta2.setAdapter(AdapterConsulta);
			
	        
		}
		

	}
}
