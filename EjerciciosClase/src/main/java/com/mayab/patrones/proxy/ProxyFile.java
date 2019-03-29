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
public class ProxyFile implements File{
    FileImplementado fileImplementado = new FileImplementado();
    @Override
    public void borrar(Usuario user) {
     if(user.getTipo().equals("SuperUsuario")){
         fileImplementado.borrar(user);
     }else{
         System.out.println("Error, no eres un SuperUsuario");
     }
    }

    @Override
    public void escribir() {
    fileImplementado.escribir();
    }

    @Override
    public void leer() {
    fileImplementado.leer();
    }
    
}
