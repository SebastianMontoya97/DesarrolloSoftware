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
public class Gas3 extends Gas{
    
    float cantidadTambores;
    
    Scanner scan = new Scanner(System.in);
    
    Gas3(){
        this.nombre="Gas Acetileno";
    }
    
    @Override
    void llenarIni() {
        
        System.out.println("Nivel de materia prima:");
        this.nivelMaterias = scan.nextFloat();
    }

    @Override
    void llenarFin() {
        
        System.out.println("Cantidad final de tambores:");
        this.cantidadTambores = scan.nextFloat();
    }

    @Override
    void calcularVol() {
        System.out.println("Calculando volumen gas acetileno");
        Random rand = new Random();
        this.cantidadEnvasado = rand.nextInt(500);
    }

    @Override
    void inspeccionar() {
        System.out.println("Inspeccion mas rigurosa");
    }
}
