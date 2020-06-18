package Modelo;
import Modelo.ClsPersona;
import Modelo.ClsGato;
import Modelo.ClsPerro;
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
        
        ClsPersona persona = new ClsPersona("Ronny");
        ClsGato gato = new ClsGato();
        ClsPerro perro = new ClsPerro("Firulais");
        
        gato.setNombre("Manolo");
        
        System.out.printf(gato.getNombre()+" es mascota de "+persona.getName());

        System.out.printf(perro.getNombre()+" es la otra mascota de "+persona.getName());

        
    }
}



