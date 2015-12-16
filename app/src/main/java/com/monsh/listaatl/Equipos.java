package com.monsh.listaatl;

/**
 * Created by monsh on 16/12/2015.
 */

//Creamos la Clase Equipos que contiene la estructura de lo que colocaremos en la lista
public class Equipos {

    //Definimos los elementos a usar
    public int icon;
    public String nombre;

    //Creamos un caso para cuando esta vacio y nos regrese al super
    public Equipos(){
        super();
    }

    //Creamos un caso para cuando este tiene parametros
    public Equipos(int icon, String nombre){
        super();
        this.icon = icon;
        this.nombre = nombre;
    }

}
