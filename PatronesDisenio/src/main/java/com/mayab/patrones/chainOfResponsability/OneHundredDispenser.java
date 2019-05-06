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
public class OneHundredDispenser extends MoneyDispenser{
    private int amount;
	@Override
	public void dispense(int request) {
		amount = (int) Math.floor(request / 100);
		if(amount>0) {
			System.out.println("Se te han entregado " + amount + " billetes de 100");
			request = request - (amount*100);
		}
		if(request == 0) {
			System.out.println("Se te ha entregado todo el dinero solicitado");
		}
		else {
			nextDispenser.dispense(request);
		}
	}
}
