package com.example.ciudades;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.List;
import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

@SuppressWarnings("deprecation")
@SuppressLint("NewApi")
public class CiudadesMainActivity<Cadena> extends ActionBarActivity implements OnClickListener {
	EditText etCiudad;
	Button bAdicionar,bEliminar;
	ListView LVciudad;
	ArrayAdapter<String> AdapterCiudades;
	List<String> ListCiudades;
	TextView TVCiudad;
	String sCiudad;
	int selectedInt;
	int pos=-1;
	View v;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ciudades_main);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		etCiudad  = (EditText) findViewById(R.id.ETCiudades);
        bAdicionar = (Button) findViewById(R.id.BTAdicionar);
        bAdicionar.setOnClickListener(this);
        bEliminar = (Button) findViewById(R.id.BTEliminar);
        bEliminar.setOnClickListener(this);
        LVciudad = (ListView) findViewById(R.id.LVCiudad);
        TVCiudad = (TextView) findViewById(R.id.TVCiudades);
        
        
        ListCiudades = new ArrayList<String>();
		AdapterCiudades = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,ListCiudades);
		AdapterCiudades.setDropDownViewResource(android.R.layout.simple_expandable_list_item_1);
		LVciudad.setAdapter(AdapterCiudades);
		
		
		
		
		
		
    }
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ciudades_main, menu);
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
	public void onClick(final View arg0) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		
		if(arg0.getId() == bAdicionar.getId()){
				sCiudad = etCiudad.getText().toString();
				String sC;
				int tamano = AdapterCiudades.getCount();
				if(tamano==0){
					if(sCiudad.equals("")){
						Toast.makeText(getBaseContext(), " Por Favor Escriba Algo!! ", Toast.LENGTH_LONG).show();

						
					}
					else{
						AdapterCiudades.add(etCiudad.getText().toString());
						AdapterCiudades.notifyDataSetChanged();
						LVciudad.setAdapter(AdapterCiudades);
						Toast.makeText(getBaseContext(), " Ciudad Adicionada ", Toast.LENGTH_LONG).show();
						etCiudad.setText("");
					}
				}
				else{
								
				for(int x=0;x<tamano;x++) {
					sC=AdapterCiudades.getItem(x).toString();
					
					if ( sCiudad.equals(sC)){
						Toast.makeText(getBaseContext(), " PENDEJO YA EXTISTE ", Toast.LENGTH_LONG).show();
						etCiudad.setText("");
					}
					else{
						if(sCiudad.equals("")){
							Toast.makeText(getBaseContext(), " Por Favor Escriba Algo!! ", Toast.LENGTH_LONG).show();

							
						}
						else{
							AdapterCiudades.add(etCiudad.getText().toString());
							AdapterCiudades.notifyDataSetChanged();
							LVciudad.setAdapter(AdapterCiudades);
							Toast.makeText(getBaseContext(), " Ciudad Adicionada ", Toast.LENGTH_LONG).show();
							etCiudad.setText("");
						}

					}
				}
				}
				
				
	}
	if(arg0.getId() == bEliminar.getId()){
		if(pos==-1){
			Toast.makeText(getBaseContext(), " No Hay Ciudad Seleccionada ", Toast.LENGTH_LONG).show();

			
		}else{
			arg0.setSelected(true);
            Cadena listChoice = (Cadena) (LVciudad.getItemAtPosition (selectedInt));

            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(CiudadesMainActivity.this);
            dialogo1.setTitle(" Importante ");
            dialogo1.setMessage("¿ Eliminar esta Ciudad ? "+sCiudad);
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton(" Confirmar ", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                	ListCiudades.remove(pos);
                	AdapterCiudades.notifyDataSetChanged();
                	pos=-1;
                }
            });
            dialogo1.setNegativeButton(" Cancelar ", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                }
            });
            dialogo1.show();
            
      
        }
	}
			
	
	
	LVciudad.setOnItemClickListener(new OnItemClickListener() {
				@Override
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
				    // When clicked, show a toast with the TextView text
					
				    Toast.makeText(getApplicationContext(),
					((TextView) view).getText(), Toast.LENGTH_SHORT).show();
				     pos=position;
				    
				}
		});
		
		
		
	
	}
}
