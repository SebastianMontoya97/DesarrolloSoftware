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
public class Montoya implements PersonaNueva{
public String nombreCompleto;
public int edad;
public Montoya(){
    this.nombreCompleto="Sebastian Montoya";
    this.edad = 21;
}
    @Override
    public String getNombreCompleto() {
       return this.nombreCompleto;
    }

    @Override
    public int getEdad() {
    return this.edad;
    }

    @Override
    public void setNombreCompleto(String nombreCompleto) {
    this.nombreCompleto=nombreCompleto;
    }

    @Override
    public void setEdad(int edad) {
    this.edad=edad;
    }
    
}
