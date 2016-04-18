package com.niidea.ejercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RegionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiones);
        final String[] ciudades = new String[]{
                "Tacna","Moquegua","Arequipa","Ica","Lima","Huaraz","Iquitos",
                "Pucallpa","Puno","Cuzco","Trujillo","Chiclayo","Piura","Tumbes",
                "Huancayo","Cerro de Pasco","Cajamarca","Bagua","Tingo María"
        };
        final String[] regiones = new String[]{
                "Tacna","Moquegua","Arequipa","Ica","Lima","Ancash","Loreto",
                "Ucayali","Puno","Cuzco","La Libertad","Lambayeque","Piura","Tumbes",
                "Junín","Pasco","Cajamarca","Amazonas","San Martín"
        };
        ArrayList<HashMap<String,String>> lista = new ArrayList<>();
        for (int i=0;i<=regiones.length-1;i++) {
            HashMap<String,String> map = new HashMap<>();
            map.put("region",regiones[i]);
            map.put("ciudad",ciudades[i]);
            lista.add(map);
        }

        ListView lRegiones = (ListView)findViewById(R.id.lstRegiones);
        ListAdapter listado = new SimpleAdapter( this, lista,
                R.layout.plantillaregiones,
                new String[]{"region","ciudad"},
                new int[]{R.id.txtRegion,R.id.txtCiudad}
        );
        lRegiones.setAdapter(listado);
    }
}
