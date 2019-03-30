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
public class Producto extends Template{
    public String codigoDeBarras;
    public double precio;
    public Producto(String codigoDeBarras, double precio){
        this.codigoDeBarras=codigoDeBarras;
        this.precio=precio;
    }
    public Boolean validarDatos(){
        if(getPrecio()>10.0){
        return true;
        }else return false;
    }
    public double getPrecio(){
        return this.precio;
    }
}
