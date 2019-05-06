/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.chainOfResponsability;

/**
 *
 * @author Sebastian M.M
 */
public abstract class MoneyDispenser {
    protected MoneyDispenser nextDispenser;
	public void setNext(MoneyDispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}
	public abstract void dispense(int request);
}
