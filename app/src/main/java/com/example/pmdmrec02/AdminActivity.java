package com.example.pmdmrec02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
    }

    public void engadirFase(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, EngadirFaseActivity.class);
        startActivity(intent);
    }

    public void seleccionarFase(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, SeleccionarFaseActivity.class);
        startActivity(intent);
    }



}
