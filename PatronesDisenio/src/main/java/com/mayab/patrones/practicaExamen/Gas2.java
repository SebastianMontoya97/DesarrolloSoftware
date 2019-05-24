/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.practicaExamen;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Sebastian M.M
 */
public class Gas2 extends Gas{

    float nivelActual;
    Scanner scan = new Scanner(System.in);
    
     Gas2(){
        this.nombre="Gas Liquidos";
    }
    
    @Override
    void llenarIni() {
        System.out.println("Nivel de materia prima:");
        this.nivelMaterias = scan.nextFloat();
    }

    @Override
    void llenarFin() {
        System.out.println("Nivel de materia prima actual:");
        float act = scan.nextFloat();
        this.consumo = act - this.nivelMaterias;
        this.nivelActual = act;
    }

    @Override
    void calcularVol() {
        System.out.println("Calculando volumen gas liquido");
        
    }

    @Override
    void inspeccionar() {
        System.out.println("Inspeccion menos rigurosa");
        
    }
    
}
