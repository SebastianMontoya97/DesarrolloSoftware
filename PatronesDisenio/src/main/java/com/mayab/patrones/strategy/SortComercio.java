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
public class SortComercio implements SortBehaviour{
    @Override
    public void sorting() {
        System.out.println("Sort de Comercio");
       /* ArrayList comercio = new ArrayList <String>();
        for(int i=0;i<transacciones.size();i++){
            comercio.add(transacciones.get(i).getCategoria());
        }
        Collections.sort();*/
    }
}
