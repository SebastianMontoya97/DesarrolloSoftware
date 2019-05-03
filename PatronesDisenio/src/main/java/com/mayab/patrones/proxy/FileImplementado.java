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
public class FileImplementado implements File{
    @Override
    public void borrar(Usuario user) {
     System.out.println("Estas borrando");
    }

    @Override
    public void escribir() {
    System.out.println("Estas escribiendo");
    }

    @Override
    public void leer() {
    System.out.println("Estas leyendo");
    }
}
