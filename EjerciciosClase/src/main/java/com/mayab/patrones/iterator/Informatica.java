/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;
import java.util.*;
/**
 *
 * @author Sebastian M.M
 */
public class Informatica {
    public String nombre;
    public ArrayList alumnos;
    public Informatica(){
        this.alumnos = new ArrayList<Alumno>();
        Alumno alumno1 = new Alumno("Alumno de informatica1");
        Alumno alumno2 = new Alumno("Alumno de informatica2");
        Alumno alumno3 = new Alumno("Alumno de informatica3");
        Alumno alumno4 = new Alumno("Alumno de informatica4");
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
    }
    public Iterator createIterator(){
    Iterator itr = alumnos.iterator();
    return itr;
    }
}
