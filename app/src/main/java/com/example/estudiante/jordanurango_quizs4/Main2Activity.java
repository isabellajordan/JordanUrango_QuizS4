package com.example.estudiante.jordanurango_quizs4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    private TextView tvHola;
    private TextView tvMensaje;
    private Button btnCerrarSesion;
    private EditText edtNombreUsuario;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvHola= findViewById(R.id.tv_hola);
        tvMensaje= findViewById(R.id.tv_hola);
       btnCerrarSesion= findViewById(R.id.btn_cerrarsesion);

       btnCerrarSesion.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent respuesta= new Intent();

               Intent solicitud2= new Intent(getApplicationContext(),MainActivity.class);
               startActivity(solicitud2);



               String usuario= edtNombreUsuario.getText().toString();
               edtNombreUsuario.setText( usuario + "Hola");




           }

       });

    }
}
