package com.example.a7s21_tsdmh_proyectofinal_qacj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegistraActivity extends AppCompatActivity {

    private EditText campoNumero;
    private EditText campoNombre;
    private EditText campoEdad;
    private EditText campoCorreo;
    private Button botonRegistrar;
    private Button botonCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registra);

        inicializarComponentes();

        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí agregar la lógica para registrar
            }
        });

        botonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void inicializarComponentes() {
        campoNumero = findViewById(R.id.txtnum);
        campoNombre = findViewById(R.id.txtnombre);
        campoEdad = findViewById(R.id.txtedad);
        campoCorreo = findViewById(R.id.txtcorreo);
        botonRegistrar = findViewById(R.id.btnregistra);
        botonCancelar = findViewById(R.id.btncanclelar);
    }
}
