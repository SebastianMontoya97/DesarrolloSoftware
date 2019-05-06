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
public class ReporteCantidad extends Reporte {
    public ReporteCantidad(){
        this.sort = new SortCantidad();
    }
    @Override
    public void transacciones(){
    sort.sorting();
    }
}
