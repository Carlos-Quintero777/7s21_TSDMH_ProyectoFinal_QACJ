package com.example.a7s21_tsdmh_proyectofinal_qacj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    private Button botonInsertar;
    private Button botonActualizar;
    private Button botonEliminar;
    private Button botonFinalizar;
    private GridView vistaDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        inicializarComponentes();

        botonInsertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(RegistraActivity.class);
            }
        });

        botonActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirActividad(ActualizarActivity.class);
            }
        });

        botonFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void inicializarComponentes() {
        botonInsertar = findViewById(R.id.btnp1Registro);
        botonActualizar = findViewById(R.id.btnactualizar);
        botonEliminar = findViewById(R.id.btnEliminar);
        botonFinalizar = findViewById(R.id.btntp1termina);
        vistaDatos = findViewById(R.id.GVDatos);
    }

    private void abrirActividad(Class<?> claseActividad) {
        Intent intent = new Intent(PrincipalActivity.this, claseActividad);
        startActivity(intent);
    }
}
