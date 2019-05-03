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
public class PersonaAdapter implements PersonaVieja{
    PersonaNueva personaNueva;
    public PersonaAdapter(PersonaNueva personaNueva){
    this.personaNueva=personaNueva;
    }

    @Override
    public String getNombre() {
    String[] separado = personaNueva.getNombreCompleto().split("\\s+");
    return separado[0];
    }

    @Override
    public String getApellido() {
    String[] separado = personaNueva.getNombreCompleto().split("\\s+");
    return separado[1];
    }

    @Override
    public String getFechaDeNacimiento() {
    int año = 2019-personaNueva.getEdad();
    return ("01-Enero-"+año);
    }

    @Override
    public void setNombre(String nombre) {
    personaNueva.setNombreCompleto(nombre);
    }

    @Override
    public void setApellido(String apellido) {
    String name = personaNueva.getNombreCompleto();
    name = name + " " + apellido;
    personaNueva.setNombreCompleto(name);
    }

    @Override
    public void setFechaDeNacimiento(String fechaDeNacimiento){
    String lastFourDigits = fechaDeNacimiento.substring(fechaDeNacimiento.length() - 4);
    int año = Integer.parseInt(lastFourDigits);
    personaNueva.setEdad(2019-año);
    }
    
}
