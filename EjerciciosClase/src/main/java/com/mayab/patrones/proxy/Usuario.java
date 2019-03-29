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
public class Usuario {
 ProxyFile proxy = new ProxyFile();
 public String nombre;
 public String tipo;
 public Usuario (String nombre, String tipo){
     this.nombre=nombre;
     this.tipo=tipo;
 }
 public String getTipo(){
     return this.tipo;
 }
 public void borrar(){
     proxy.borrar(this);
 }
 public void escribir(){
     proxy.escribir();
 }
 public void leer(){
     proxy.leer();
 }
 
}
