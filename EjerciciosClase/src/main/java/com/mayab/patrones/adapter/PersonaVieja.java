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
public interface PersonaVieja {
    public String getNombre();
    public String getApellido();
    public String getFechaDeNacimiento();
    public void setNombre(String nombre);
    public void setApellido(String apellido);
    public void setFechaDeNacimiento(String fechaDeNacimiento);
}
