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
public class TwoHundredDispenser extends MoneyDispenser{
    private int amount;
	@Override
	public void dispense(int request) {
		amount = (int) Math.floor(request / 200);
		if(amount-1>0) {
			System.out.println("Se te han entregado " + (amount-1) + " billetes de 200");
			request = request - ((amount-1)*200);
		}
		if(request == 0) {
			System.out.println("Se te ha entregado todo el dinero solicitado");
		}
		else {
			nextDispenser.dispense(request);
		}
	}
}
