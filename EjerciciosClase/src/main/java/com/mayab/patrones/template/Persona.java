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
public class Persona extends Template{
    public String nombre;
    public String direccion;
    public Integer edad;
    public Persona(String nombre, String direccion, Integer edad){
        this.nombre=nombre;
        this.direccion=direccion;
        this.edad=edad;
    }
    public Boolean validarDatos(){
        if(getEdad()>18){
        return true;
        }else return false;
    }
    public Integer getEdad(){
        return this.edad;
    }
}
