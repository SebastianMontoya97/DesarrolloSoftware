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
public class IsosCreator extends TrianguloCreator {
@Override
 public Triangulo createTriangle (String type){
     if(type.equals("Isosceles")){
         return new IsosTri();
     }else return null;
 }
}
