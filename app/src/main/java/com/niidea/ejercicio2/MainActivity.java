package com.niidea.ejercicio2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bWeb = (Button)findViewById(R.id.btnWeb);
        Button bLSimple = (Button)findViewById(R.id.btnListaSimple);
        Button bLComple = (Button)findViewById(R.id.btnListaCompleja);
        Button bLMComple = (Button)findViewById(R.id.btnListaMuyCompleja);

        bWeb.setOnClickListener(this);
        bLSimple.setOnClickListener(this);
        bLComple.setOnClickListener(this);
        bLMComple.setOnClickListener(this);
        //Todos los botones al hacer clic
        //llaman al método onClick

    }

    @Override
    public void onClick(View v) {
        //v.getId permite obtener el ID del
        //objeto que generó el evento
        switch (v.getId()){
            case R.id.btnWeb:
                verWeb();
                break;
            case R.id.btnListaSimple:
                verListaCiudades();
                break;
            case R.id.btnListaCompleja:
                verListaCompleja();
                break;
            case R.id.btnListaMuyCompleja:

                break;
        }
    }

    private void verListaCompleja() {
        Intent i = new Intent(this,Ciudades2Activity.class);
        startActivity(i);
    }

    private void verListaCiudades() {
        Intent i = new Intent(this,CiudadesActivity.class);
        startActivity(i);
    }

    private void verListaRegiones() {
        Intent i = new Intent(this,CiudadesActivity.class);
        startActivity(i);
    }

    private void verWeb() {
        //String ruta = "http://www.nike.com/us/en_us/";
        String ruta = "https://www.youtube.com/watch?v=eZ-js5zn-I0";
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse(ruta));
        startActivity(intent);
    }
}
