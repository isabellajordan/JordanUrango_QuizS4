package com.example.estudiante.jordanurango_quizs4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnIngresar;
    private TextView tvBienvenida;
   public EditText edtNombreUsuario;
    private EditText edtContraseña;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = findViewById(R.id.btn_ingresar);
        tvBienvenida= findViewById(R.id.tv_bienvenido);
        edtNombreUsuario= findViewById(R.id.edt_usuario);
        edtContraseña= findViewById(R.id.edt_contraseña);


        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


String nombreUsuario = "administrador";
String contraseña= "123456";



if(nombreUsuario.equals(edtNombreUsuario.getText().toString()) && contraseña.equals(edtContraseña.getText().toString())){

    Intent solicitud= new Intent(getApplicationContext(),Main2Activity.class);


    Intent respuesta2=  new Intent();
    startActivity(solicitud);


    startActivity(solicitud);
}else{

                    Toast.makeText( MainActivity.this,"El nombre de usuario o contraseña no es correcto", Toast.LENGTH_SHORT).show();


                }


            }
        });

    }
}
