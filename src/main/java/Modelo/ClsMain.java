package Modelo;
import Modelo.ClsPersona;


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
        
        System.out.println(persona.getName());

        persona.setName("Kevin");
    
        System.out.println(persona.getName());

        
    }
}



