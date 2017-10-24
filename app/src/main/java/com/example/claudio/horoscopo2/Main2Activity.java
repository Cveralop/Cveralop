package com.example.claudio.horoscopo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    TextView et_usuario;
    EditText et_password;
    TextView texto;
    ListView listadoSignos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        et_usuario=(TextView)findViewById(R.id.mostrarnombre);

        Bundle bundle=getIntent().getExtras();
        et_usuario.setText(bundle.getString("per"));

        listadoSignos=(ListView)findViewById(R.id.listado);
        texto=(TextView)findViewById(R.id.texto);

        ArrayList<String> listado=new ArrayList<String>();
        listado.add("Tauro");
        listado.add("Acuario");
        listado.add("Aries");
        listado.add("Sagitario");
        listado.add("Capricornio");
        listado.add("Leo");
        listado.add("Escorpion");
        listado.add("Geminis");
        listado.add("Piscis");
        listado.add("Libra");
        listado.add("Virgo");
        listado.add("Cancer");

        ArrayAdapter adaptador = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listado);

        listadoSignos.setAdapter(adaptador);

        listadoSignos.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                texto.setText(parent.getItemAtPosition(i).toString());
                String signos = parent.getItemAtPosition(i).toString();

                if(signos.equals("Aries")){
                    Intent inte = new Intent(Main2Activity.this,Main3Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this,"Has seleccionado Aries",Toast.LENGTH_SHORT).show();
                }else if (signos.equals("Tauro")){
                    Intent inte = new Intent(Main2Activity.this,Main4Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this,"Has seleccionado Tauro",Toast.LENGTH_SHORT).show();
                }else  if (signos.equals("Geminis")){
                    Intent inte = new Intent(Main2Activity.this,Main5Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this,"Has seleccionado Geminis",Toast.LENGTH_SHORT).show();
                }else  if (signos.equals("Cancer")){
                    Intent inte = new Intent(Main2Activity.this,Main6Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this,"Has seleccionado Cancer",Toast.LENGTH_SHORT).show();

                }else  if (signos.equals("Leo")) {
                Intent inte = new Intent(Main2Activity.this, Main7Activity.class);
                inte.putExtra("usuario", et_usuario.getText().toString());
                startActivity(inte);
                Toast.makeText(Main2Activity.this, "Has seleccionado Leo", Toast.LENGTH_SHORT).show();

                }else  if (signos.equals("Virgo")) {
                    Intent inte = new Intent(Main2Activity.this, Main8Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this, "Has seleccionado Virgo", Toast.LENGTH_SHORT).show();

                }else  if (signos.equals("Libra")) {
                    Intent inte = new Intent(Main2Activity.this, Main9Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this, "Has seleccionado Libra", Toast.LENGTH_SHORT).show();

                }else  if (signos.equals("Escorpion")) {
                    Intent inte = new Intent(Main2Activity.this, Main10Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this, "Has seleccionado Escorpion", Toast.LENGTH_SHORT).show();

                }else  if (signos.equals("Sagitario")) {
                    Intent inte = new Intent(Main2Activity.this, Main11Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this, "Has seleccionado Sagitario", Toast.LENGTH_SHORT).show();

                }else  if (signos.equals("Capricornio")) {
                    Intent inte = new Intent(Main2Activity.this, Main12Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this, "Has seleccionado Capricornio", Toast.LENGTH_SHORT).show();

                }else  if (signos.equals("Acuario")) {
                    Intent inte = new Intent(Main2Activity.this, Main13Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this, "Has seleccionado Acuario", Toast.LENGTH_SHORT).show();

                }else  if (signos.equals("Piscis")) {
                    Intent inte = new Intent(Main2Activity.this, Main14Activity.class);
                    inte.putExtra("usuario", et_usuario.getText().toString());
                    startActivity(inte);
                    Toast.makeText(Main2Activity.this, "Has seleccionado Piscis", Toast.LENGTH_SHORT).show();

                }


            }
        });
    }
}
