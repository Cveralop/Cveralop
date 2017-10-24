package com.example.claudio.horoscopo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtnombre;
    TextView txtcontrasena;
    Button btnaceptar;
    String per="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre=(TextView) findViewById(R.id.txtusuario);
        txtcontrasena=(TextView)findViewById(R.id.txtpassword);
        btnaceptar=(Button)findViewById(R.id.aceptar);

        btnaceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("per",txtnombre.getText().toString());
                startActivity(i);

                Toast.makeText(MainActivity.this,"Bienvenido",Toast.LENGTH_SHORT).show();
            }
        });

    }

    }

