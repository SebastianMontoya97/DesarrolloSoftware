/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

/**
 *
 * @author Sebastian M.M
 */
public class ReporteCategoria extends Reporte{
     public ReporteCategoria(){
        this.sort = new SortCategoria();
    }
    @Override
    public void transacciones(){
    sort.sorting();
    }
}
