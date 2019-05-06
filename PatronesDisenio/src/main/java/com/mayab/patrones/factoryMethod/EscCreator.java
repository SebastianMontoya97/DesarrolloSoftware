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
public class EscCreator extends TrianguloCreator {
@Override
public Triangulo createTriangle (String type){
     if(type.equals("Escaleno")){
         return new EscTri();
     }else return null;
 }
}
