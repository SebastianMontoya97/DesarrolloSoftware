/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factoryMethod;

/**
 *
 * @author Sebastian M.M
 */
public class Triangulo {
    public String name;
    public  int[] lados = new int[3];
    public void calcularArea(){
        double area=0;
        double s=0;
        for(int i=0;i<lados.length;i++){
            s=s+lados[i];
        }s=s/2;
        double result=0;
        result = s*(s-lados[0])*(s-lados[1])*(s-lados[2]);
        result = Math.sqrt(result);
        System.out.println("AREA: "+result);
    }
    public void calcularPerimetro(){
        double perimetro=0;
        for(int i=0;i<lados.length;i++){
            perimetro=perimetro+lados[i];
        }
        System.out.println("PERIMETRO: "+perimetro);
    }
    public String getName(){
        return name;
    }
}
