/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;

/**
 *
 * @author Sebastian M.M
 */
public class TemplateController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona("Sebastian","Av. Bonampak",21);
        Producto producto = new Producto ("124214231",15.0);
        Persona persona2 = new Persona("Sebastian","Av. Bonampak",10);
        Producto producto2 = new Producto ("124214231",9.0);
        System.out.println("Persona valida:");
        persona.update();
        System.out.println("Persona NO valida:");
        persona2.update();
        System.out.println("Producto valido:");
        producto.update();
        System.out.println("Producto NO valido:");
        producto2.update();
        
    }
    
}
