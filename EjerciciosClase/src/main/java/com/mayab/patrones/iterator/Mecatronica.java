/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sebastian M.M
 */
public class Mecatronica {
    public String nombre;
    public Alumno[] alumnos;
    public Mecatronica(){
        this.alumnos = new Alumno[4];
        Alumno alumno1 = new Alumno("Alumno de mecatronica1");
        Alumno alumno2 = new Alumno("Alumno de mecatronica2");
        Alumno alumno3 = new Alumno("Alumno de mecatronica3");
        Alumno alumno4 = new Alumno("Alumno de mecatronica4");
        alumnos[0]=alumno1;
        alumnos[1]=alumno2;
        alumnos[2]=alumno3;
        alumnos[3]=alumno4;
    }
    public Iterator createIterator(){
    Iterator itr = Arrays.asList(this.alumnos).iterator();
    return itr;
    }
}
