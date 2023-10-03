package com.example.actividad21_va;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnInicio = (Button) findViewById(R.id.btnInicio);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ETNombre=(EditText) findViewById(R.id.txtNombreview);
                String StNombre=ETNombre.getText().toString();
                Intent sIntent = new Intent(Inicio.this, MainActivity2.class);
                sIntent.putExtra("STNombre", StNombre);
                startActivity(sIntent);
            }
        });
    }
}