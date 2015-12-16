package com.monsh.listaatl;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Declaro mi lista
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Definir el array
        Equipos equipos_datos[]=new Equipos[]{
                new Equipos(R.mipmap.ic_america,"Club America"),
                new Equipos(R.mipmap.ic_jaguares,"Jaguares de Chiapas"),
                new Equipos(R.mipmap.ic_leon,"Club Leon FC"),
                new Equipos(R.mipmap.ic_puebla,"Puebla FC"),
                new Equipos(R.mipmap.ic_pumas,"Pumas"),
                new Equipos(R.mipmap.ic_tigres,"Tigres"),
                new Equipos(R.mipmap.ic_toluca,"Toluca")
        };

        //Al adaptador le paso el contenido de mi arreglo cargado
        EquiposAdapter adapter = new EquiposAdapter(this,R.layout.item_row,equipos_datos);

        //Me traigo la lista y la enlazo a su vista, ademas asigno el adaptador lleno.
        lv = (ListView) findViewById(R.id.lv);
        lv.setAdapter(adapter);

        //Escucho los eventos en los items (elementos de la lista)
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView v =(TextView) view.findViewById(R.id.tv);
                Toast.makeText(getApplicationContext(),v.getText(),Toast.LENGTH_SHORT).show();
            }
        });

    }
}
