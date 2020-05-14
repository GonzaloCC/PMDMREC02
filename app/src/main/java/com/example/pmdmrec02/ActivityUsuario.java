package com.example.pmdmrec02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ActivityUsuario extends AppCompatActivity {
    Spinner sProvincias;
    int numeroProvincia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
        xestionarEventos();
    }
    /**
     * Neste método asociamos os listener aos view onde queramos xestionar eventos
     */
    private void xestionarEventos(){

        Spinner sProvincias = (Spinner) findViewById(R.id.spinnerProvincias);
        sProvincias.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int pos, long id) {
                if(parent.getItemAtPosition(pos).toString().equals("A Coruña")) {
                    numeroProvincia = 1;
                     }
                else if(parent.getItemAtPosition(pos).toString().equals("Lugo")) {
                    numeroProvincia = 2;
                    }
                else if(parent.getItemAtPosition(pos).toString().equals("Ourense")) {
                    numeroProvincia = 3;
                }
                else if (parent.getItemAtPosition(pos).toString().equals("Pontevedra")) {
                    numeroProvincia = 4;
                }
            }



            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
    }
    public void verFase(View view){
        switch (numeroProvincia){
            case 1:
                Intent intentCoruna = new Intent(this, CorunaActivity.class);
                startActivity(intentCoruna);
                break;
            case 2:
                Intent intentLugo = new Intent(this, LugoActivity.class);
                startActivity(intentLugo);
                break;
            case 3:
                Intent intentOurense = new Intent(this, OurenseActivity.class);
                startActivity(intentOurense);
                break;
            case 4:
                Intent intentPontevedra = new Intent(this, PontevedraActivity.class);
                startActivity(intentPontevedra);
                break;
        }
    }

}