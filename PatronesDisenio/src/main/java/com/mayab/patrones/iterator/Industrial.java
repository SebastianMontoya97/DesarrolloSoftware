/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Sebastian M.M
 */
public class Industrial {
    public String nombre;
    public List alumnos;
    public Industrial(){
        this.alumnos = new ArrayList();
        Alumno alumno1 = new Alumno("Alumno de industrial1");
        Alumno alumno2 = new Alumno("Alumno de industrial2");
        Alumno alumno3 = new Alumno("Alumno de industrial3");
        Alumno alumno4 = new Alumno("Alumno de industrial4");
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
