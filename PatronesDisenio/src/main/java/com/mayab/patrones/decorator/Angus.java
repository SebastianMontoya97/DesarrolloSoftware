/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.decorator;

/**
 *
 * @author Sebastian M.M
 */
public class Angus extends Burger{
    public Angus(){
        this.description = "Angus";
    }
    public double cost(){
        return 2.50;
    }
}
