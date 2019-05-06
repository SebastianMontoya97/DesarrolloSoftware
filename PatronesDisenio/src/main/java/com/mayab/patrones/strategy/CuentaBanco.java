/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;
import java.util.ArrayList;
/**
 *
 * @author Sebastian M.M
 */
public class CuentaBanco {
    public double saldo;
    public ArrayList <Transaccion> transacciones = new ArrayList();
    public CuentaBanco(){
        this.saldo=0;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void agregarTransaccion(Transaccion transaccion){
        transacciones.add(transaccion);
    }
    public void generarReporte(String tipo){
        if(tipo == "Cantidad"){
            ReporteCantidad rcantidad = new ReporteCantidad();
            rcantidad.transacciones();
        }else if(tipo == "Categoria"){
            ReporteCategoria rcategoria = new ReporteCategoria();
            rcategoria.transacciones();
        }else if(tipo == "Comercio"){
           ReporteComercio rcomercio = new ReporteComercio();
           rcomercio.transacciones();
        }else if(tipo == "Fecha"){
            ReporteFecha rfecha = new ReporteFecha();
            rfecha.transacciones();
        }else{
            System.out.println("No existe dicho tipo de reporte");
        }
    }
}
