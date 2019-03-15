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
public class Usuario {
    private String nombre;
    private String apellido;
    private boolean logeado;
    private static Usuario instance;
    
    private Usuario(String nombre, String apellido){
    this.nombre=nombre;
    this.apellido=apellido;
    this.logeado=false;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public boolean getLogeado(){
        return this.logeado;
    }    
    public void logIN(){
        if(getLogeado()==false){
            this.logeado=true;
        }
    }
    public void logOut(){
        if(getLogeado()==true){
            this.logeado=false;
        }
    }
    public static Usuario getInstance(String nombre, String apellido){
        if(instance == null){
            System.out.println("Creando instancia unica de usuario");
            instance = new Usuario(nombre, apellido);
        }
        System.out.println("Regresando instancia de usuario");
        return instance;
    }
    
}
