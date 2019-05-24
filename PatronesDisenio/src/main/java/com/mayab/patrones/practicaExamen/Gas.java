/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.practicaExamen;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Sebastian M.M
 */
public abstract class Gas {
    
    String fecha;
    float cantidadEnvasado;
    float consumo;
    String firmas[];
    float nivelMaterias;
    float volumenGasEnvasado;
    String nombre;
    
    
    final void llenado(){
        llenarIni();
        llenarFin();
        calcularVol();
        inspeccionar();
        imprimirReporte();
    }
    
    abstract void llenarIni();
    abstract void llenarFin();
    abstract void calcularVol();
    abstract void inspeccionar();
    void imprimirReporte(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	LocalDate localDate = LocalDate.now();
        System.out.println("Reporte de "+this.nombre+"*********************");
	System.out.println("Fecha:" +dtf.format(localDate)); //2016/11/16
        System.out.println("Cantidad envasada:"+cantidadEnvasado);
        System.out.println("Firmas: Firma 1 y Firma 2");
    }
    
}
