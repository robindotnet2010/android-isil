package com.niidea.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class CiudadesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudades);
        String[] ciudades = new String[]{
           "Tacna","Moquegua","Arequipa","Ica","Lima","Huaraz","Iquitos",
                "Pucallpa","Puno","Cuzco","Trujillo","Chiclayo","Piura","Tumbues",
                "Huancayo","Cerro de Pasco","Cajamarca","Bagua","Tingo María"
        };

        ListView lCiudades = (ListView)findViewById(R.id.lstCiudades);

        ListAdapter listado = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,ciudades);
        //Se crea un listAdapter para poder preparar el arreglo en
        //formato ArrayAdapter que es el que acepta la lista

        lCiudades.setAdapter(listado);
        //Asi se asigna a la lista el listAdapter creado


    }
}
