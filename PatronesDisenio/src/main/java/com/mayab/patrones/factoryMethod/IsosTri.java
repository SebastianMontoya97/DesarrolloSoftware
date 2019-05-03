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
public class IsosTri extends Triangulo{
    public IsosTri(){
        this.name="Isosceles";
        this.lados[0]=10;
        this.lados[1]=10;
        this.lados[2]=8;
    }
}
