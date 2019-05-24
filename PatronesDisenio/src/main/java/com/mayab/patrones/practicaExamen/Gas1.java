/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.practicaExamen;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Sebastian M.M
 */
public class Gas1 extends Gas{
    
    float temperaturaEnvase;
    float presionEnvase;
    float usoBomba;
    float horasUso;
    Scanner scan = new Scanner(System.in);
    
    Gas1(){
        this.nombre="Gas Alta Presion";
    }
    
    @Override
    void llenarIni() {
        System.out.println("Uso de la bomba:");
        this.usoBomba = scan.nextFloat();
        System.out.println("Horas de uso:");
        this.horasUso = scan.nextFloat();
        System.out.println("Nivel de materia prima:");
        this.nivelMaterias = scan.nextFloat();
    }

    @Override
    void llenarFin() {
        System.out.println("Temperatura de los envases llenado:");
        this.temperaturaEnvase = scan.nextFloat();
        System.out.println("Presion de los envases:");
        this.presionEnvase = scan.nextFloat();
    }

    @Override
    void calcularVol() {
        System.out.println("Calculando volumen gas alta presion");
    Random rand = new Random();
        this.cantidadEnvasado = rand.nextInt(500);
    }

    @Override
    void inspeccionar() {
        System.out.println("Inspeccion normal");
        
    }
    
}
