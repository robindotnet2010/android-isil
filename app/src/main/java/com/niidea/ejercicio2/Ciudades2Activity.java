package com.niidea.ejercicio2;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Alumno-JG on 11/04/2016.
 */
public class Ciudades2Activity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final String[] ciudades = new String[]{
                "Tacna","Moquegua","Arequipa","Ica","Lima","Huaraz","Iquitos",
                "Pucallpa","Puno","Cuzco","Trujillo","Chiclayo","Piura","Tumbues",
                "Huancayo","Cerro de Pasco","Cajamarca","Bagua","Tingo María"
        };
        ListAdapter listado = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,ciudades);
        //El ListActivity incluye un listView
        setListAdapter(listado);

        ListView lista = getListView();
        //Con getListView se obtiene la lista
        //que contiene el ListActivity

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //La variable position permite obtener
                //El índice del elemento seleccionado
                String ciudad = ciudades[position];
                Toast.makeText(Ciudades2Activity.this,ciudad,
                        Toast.LENGTH_SHORT).show();

                Bundle datos = new Bundle();
                //La clase Bundle se emplea para pasar datos
                //de un Activity a otro
                datos.putString("ciudadElegida",ciudad);
                //Asi dentro del bundle se crea una clave
                //para almacenar un dato
                Intent i = new Intent(Ciudades2Activity.this,
                        CiudadSeleccionadaActivity.class);
                i.putExtras(datos);
                //Asi el intent incluira la información
                //del objeto bundle
                startActivity(i);
            }
        });


    }
}

