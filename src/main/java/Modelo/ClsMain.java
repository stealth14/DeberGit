package Modelo;
import Modelo.ClsPersona;
import Modelo.ClsGato;
import Modelo.ClsPerro;
import Modelo.Clsdocumento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ronnycajas
 */

public class ClsMain {

        public static void main(String[] args) {
        
        Clsdocumento doc = new Clsdocumento();    
        ClsPersona persona = new ClsPersona(" Ronny ");
        ClsPersona persona2 = new ClsPersona(" Ander ");
        ClsGato gato = new ClsGato();
        ClsGato gato2 = new ClsGato();
        ClsPerro perro = new ClsPerro(" Firulais ");
        ClsPerro perro2 = new ClsPerro(" Beto ");

        gato.setNombre(" Manolo ");
        gato2.setNombre(" Martin ");
        
        //Imprimir 
        System.out.printf(gato.getNombre()+" es el gato de "+persona.getName());
        System.out.printf("\n");
        System.out.printf(perro.getNombre()+" es el perro de "+persona.getName());
        System.out.printf("\n");
        System.out.printf(gato2.getNombre()+" es el gato de "+persona2.getName());
        System.out.printf("\n");
        System.out.printf(perro2.getNombre()+" es el perro de "+persona2.getName());
        
    }
}



