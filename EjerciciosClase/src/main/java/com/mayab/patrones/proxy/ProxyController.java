/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

/**
 *
 * @author Sebastian M.M
 */
public class ProxyController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuario usuarioNormal = new Usuario ("Sebastian","Normal");
        Usuario usuarioSuper = new Usuario ("Kikon","SuperUsuario");
        System.out.println("USUARIO NORMAL: ");
        usuarioNormal.borrar();
        usuarioNormal.escribir();
        usuarioNormal.leer();
        System.out.println("USARIO SUPER: ");
        usuarioSuper.borrar();
        usuarioSuper.escribir();
        usuarioSuper.leer();
        
    }
    
}
