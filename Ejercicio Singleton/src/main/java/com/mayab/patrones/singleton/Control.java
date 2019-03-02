/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.singleton;

/**
 *
 * @author Sebastian M.M
 */
public class Control {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario user = Usuario.getInstance("Sebastian","Montoya");
        Usuario user2 = Usuario.getInstance("Benjamin", "Monterroza");
        System.out.println(user.getApellido()); System.out.println(user.getNombre());
        user.logIN();
        System.out.println(user.getLogeado());
        user.logOut();
        System.out.println(user.getLogeado());
        System.out.println(user2.getLogeado());
        
        
    }
    
    
}
