package com.example.a7s21_tsdmh_proyectofinal_qacj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class ActualizarActivity extends AppCompatActivity {

    private EditText campoNumero;
    private EditText campoNombre;
    private EditText campoEdad;
    private EditText campoCorreo;
    private Button botonActualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actualizar);

        inicializarComponentes();

        botonActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aquí agregar la lógica para actualizar
            }
        });
    }

    private void inicializarComponentes() {
        campoNumero = findViewById(R.id.txtNum);
        campoNombre = findViewById(R.id.txtNombre);
        campoEdad = findViewById(R.id.txtEdad);
        campoCorreo = findViewById(R.id.txtCorreo);
        botonActualizar = findViewById(R.id.btnRegistrarActualizacion);
    }
}
