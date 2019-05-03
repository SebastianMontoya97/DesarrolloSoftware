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
public class EqTri extends Triangulo{
    public EqTri(){
        this.name = "Equilatero";
        this.lados[0] = 10;
        this.lados[1] = 10;
        this.lados[2] = 10;
    }
}
