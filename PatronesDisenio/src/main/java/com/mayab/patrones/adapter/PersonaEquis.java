/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.adapter;

/**
 *
 * @author Sebastian M.M
 */
public class PersonaEquis implements PersonaVieja{
    public String nombre;
    public String apellido;
    public String fechaDeNacimiento;
    public PersonaEquis(){
        this.nombre = "Alejandro";
        this.apellido="Gomez";
        this.fechaDeNacimiento="12/02/2000";
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getFechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setFechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento=fechaDeNacimiento;
    }
}
