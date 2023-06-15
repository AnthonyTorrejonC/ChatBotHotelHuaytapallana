package com.example.pmv01_chatbot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginCliente extends AppCompatActivity {
    Button btnInicio, btnloginAdm;
    TextView txtRegistrar;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_cliente);

        username = findViewById(R.id.username);

        password =findViewById(R.id.password);

        btnInicio = (Button) findViewById(R.id.btnIniciar);
        btnloginAdm = (Button) findViewById(R.id.btnIniciarAdm);
        txtRegistrar = findViewById(R.id.textRegistrar);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("anthony") && password.getText().toString().equals("12345")){
                    //correct
                    Toast.makeText(LoginCliente.this,"Ingreso exitoso",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginCliente.this, Menublank.class);
                    startActivity(intent);
                }else
                    //incorrect
                    Toast.makeText(LoginCliente.this,"Datos Incorrectos !!!",Toast.LENGTH_SHORT).show();
            }
        });





        btnloginAdm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(LoginCliente.this, LoginAdministrador.class);
                startActivity(intent);
            }
        });

        txtRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginCliente.this, RegistrarCliente.class);
                startActivity(i);
            }
        });
    }
}