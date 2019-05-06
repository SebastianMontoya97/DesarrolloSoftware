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
        ReporteCantidad rcantidad = new ReporteCantidad();
        ReporteCategoria rcategoria = new ReporteCategoria();
        ReporteComercio rcomercio = new ReporteComercio();
        ReporteFecha rfecha = new ReporteFecha();
        
        rcantidad.transacciones();
        rcategoria.transacciones();
        rcomercio.transacciones();
        rfecha.transacciones();
    }
    
}
