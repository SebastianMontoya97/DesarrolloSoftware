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
public class SingletonController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario user = Usuario.getInstance("Sebastian","Montoya");
        Usuario user2 = Usuario.getInstance("Benjamin", "Monterroza");
        System.out.println("Apellido de usuario 1: "+user.getApellido()); System.out.println("Nombre de usuario 1:"+user.getNombre());
        System.out.println("Logeando a "+user.getNombre());
        user.logIN();
        System.out.println(user.getNombre()+" se encuentra Logeado?");
        System.out.println(user.getLogeado());
        System.out.println("Deslogeando a "+user.getNombre());
        user.logOut();
        System.out.println(user.getNombre()+" se encuentra Logeado?");
        System.out.println(user.getLogeado());
        System.out.println("El usuario 2 no ha sido logeado, debería regresar falso al checar si se encuentra logeado");
        System.out.println(user2.getLogeado());
        
        
    }
    
    
}
