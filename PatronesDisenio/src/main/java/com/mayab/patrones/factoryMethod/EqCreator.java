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
public class EqCreator extends trianguloCreator {
@Override
public Triangulo createTriangle (String type){
     if(type.equals("Equilatero")){
         return new EqTri();
     }else return null;
 }
}
