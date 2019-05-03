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
public class FactoryMethodController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        trianguloCreator escCreator = new EscCreator();
        trianguloCreator eqCreator = new EqCreator();
        trianguloCreator isosCreator = new IsosCreator();
        
        Triangulo triangulo = escCreator.createTriangle("Escaleno");
        System.out.println("Tipo de triangulo: "+triangulo.getName());
        triangulo.calcularPerimetro();
        triangulo.calcularArea();
        System.out.println("");
        triangulo = eqCreator.createTriangle("Equilatero");
        System.out.println("Tipo de triangulo: "+triangulo.getName());
        triangulo.calcularPerimetro();
        triangulo.calcularArea();
        System.out.println("");
        triangulo = isosCreator.createTriangle("Isosceles");
        System.out.println("Tipo de triangulo: "+triangulo.getName());
        triangulo.calcularPerimetro();
        triangulo.calcularArea();
    }
    
}
