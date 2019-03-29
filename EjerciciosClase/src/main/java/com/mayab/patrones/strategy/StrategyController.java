/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;
import java.util.*;
/**
 *
 * @author Sebastian M.M
 */
public class StrategyController {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>(); 
        al.add(1233); 
        al.add(54235); 
        al.add(1231); 
        al.add(12); 
        al.add(121); 
        Collections.sort(al);
        System.out.println("ORDENADO: ");
        System.out.println(al);
    }
    
}
