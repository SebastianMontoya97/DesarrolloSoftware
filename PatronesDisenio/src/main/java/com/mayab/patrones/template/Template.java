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
public abstract class Template {
    final void update(){
        leerDatos();
        if(validarDatos())
        guardar();
        else
        error();
    }
    public void error(){
        System.out.println("Hay un error");
    }
    public void guardar(){
        System.out.println("Guardando");
    }
    public void leerDatos(){
        System.out.println("Leyendo datos");
    }
    abstract Boolean validarDatos();
    
}
