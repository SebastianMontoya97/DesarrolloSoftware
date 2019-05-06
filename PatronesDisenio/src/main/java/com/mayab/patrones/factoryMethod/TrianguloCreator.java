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
public abstract class TrianguloCreator {
    protected abstract Triangulo createTriangle(String type);
    public Triangulo calcularMedidas(String type){
        Triangulo triangulo = createTriangle(type);
        return triangulo;
    }
}
