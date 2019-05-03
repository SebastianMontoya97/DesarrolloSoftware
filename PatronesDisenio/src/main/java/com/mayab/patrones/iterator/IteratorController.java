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
public class IteratorController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Informatica informatica = new Informatica();
        Civil civil = new Civil();
        Mecatronica mecatronica = new Mecatronica();
        Industrial industrial = new Industrial();
        Iterator infIterator = informatica.createIterator();
        Iterator civIterator = civil.createIterator();
        Iterator mecIterator = mecatronica.createIterator();
        Iterator indIterator = industrial.createIterator();
        pasarLista(infIterator, civIterator,mecIterator,indIterator);
    }
    
    public static void print(Iterator itr){
        Iterator iteratore = itr;
        while(itr.hasNext()) {
         Alumno alumno = (Alumno)itr.next();
         System.out.println(alumno.getNombre());
      }
    }
    public static void pasarLista(Iterator itr1, Iterator itr2, Iterator itr3, Iterator itr4){
        print(itr1);
        System.out.println("");
        print(itr2);
        System.out.println("");
        print(itr3);
        System.out.println("");
        print(itr4);
    }
    
}
