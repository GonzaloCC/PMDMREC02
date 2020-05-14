package com.example.pmdmrec02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText tvUsuario,tvContrasinal;
    private RadioButton rbUsuario,rbAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbUsuario=(RadioButton) findViewById(R.id.radioButtonUsuario);
        rbAdmin=(RadioButton) findViewById(R.id.radioButtonAdministrador);
        tvUsuario=(EditText) findViewById(R.id.editTextUsuario);
        tvContrasinal=(EditText) findViewById(R.id.editTextContrasinal);
    }



    public void ok(View view) {
        // Do something in response to button
        if(rbUsuario.isChecked()) {
            Intent intent = new Intent(this, ActivityUsuario.class);
            startActivity(intent);
        }
        else if(rbAdmin.isChecked() && tvUsuario.getText().toString().equals("admin")&& tvContrasinal.getText().toString().equals("abc123.")){
            Intent intent = new Intent(this, AdminActivity.class);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Usuario ou contrasinal incorrecta",Toast.LENGTH_LONG).show();
            tvUsuario.setText("");
            tvContrasinal.setText("");
        }
    }


}
