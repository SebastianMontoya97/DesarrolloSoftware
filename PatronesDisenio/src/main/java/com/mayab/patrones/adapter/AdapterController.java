/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.adapter;

/**
 *
 * @author Sebastian M.M
 */
public class AdapterController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PersonaEquis viejo = new PersonaEquis();
       Montoya nuevo = new Montoya();
       PersonaVieja adaptado = new PersonaAdapter(nuevo);
       //VIEJO
       System.out.println("Persona vieja: "+viejo.getNombre()+" "+viejo.getApellido()+" "+viejo.getFechaDeNacimiento());
       //NUEVO
       System.out.println("Persona nueva: "+nuevo.getNombreCompleto()+" "+nuevo.getEdad());
       //ADAPTADO
       System.out.println("Persona adaptada: "+adaptado.getNombre()+" "+adaptado.getApellido()+" "+adaptado.getFechaDeNacimiento());
    }
}
 