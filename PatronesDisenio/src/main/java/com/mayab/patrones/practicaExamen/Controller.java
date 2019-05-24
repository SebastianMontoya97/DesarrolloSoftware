/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.practicaExamen;

/**
 *
 * @author Sebastian M.M
 */
public class Controller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Gas1 gasnumero1 = new Gas1();
    Gas1 otrogas1 = new Gas1();
    Gas2 gasnumero2 = new Gas2();
    Gas3 gasnumero3 = new Gas3();
    System.out.println("Comenzamos con Gas 2");
    gasnumero2.llenado();
    System.out.println("Comenzamos con Gas 3");
    gasnumero3.llenado();
    }
    
}
