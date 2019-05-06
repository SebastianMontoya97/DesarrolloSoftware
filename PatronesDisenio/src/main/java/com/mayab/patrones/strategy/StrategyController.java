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
        CuentaBanco cuenta = new CuentaBanco();
        Transaccion t1 = new Transaccion("17Febrero","Pesquero",1000,"Urgente");
        Transaccion t2 = new Transaccion("18Febrero","Turista",254,"Pendiente");
        Transaccion t3 = new Transaccion("19Febrero","Hotelero",1231,"Importante");
        Transaccion t4 = new Transaccion("20Febrero","Comida",412,"Disponible");
        cuenta.agregarTransaccion(t1);
        cuenta.agregarTransaccion(t2);
        cuenta.agregarTransaccion(t3);
        cuenta.agregarTransaccion(t4);
        
        cuenta.generarReporte("Cantidad");
        cuenta.generarReporte("Categoria");
        cuenta.generarReporte("Comercio");
        cuenta.generarReporte("Fecha");
        /*
        ReporteCantidad rcantidad = new ReporteCantidad();
        ReporteCategoria rcategoria = new ReporteCategoria();
        ReporteComercio rcomercio = new ReporteComercio();
        ReporteFecha rfecha = new ReporteFecha();
        
        rcantidad.transacciones();
        rcategoria.transacciones();
        rcomercio.transacciones();
        rfecha.transacciones();*/
    }
    
}
