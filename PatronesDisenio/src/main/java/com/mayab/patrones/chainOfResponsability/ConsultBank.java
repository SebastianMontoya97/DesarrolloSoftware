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
public class ConsultBank extends BankHandler{
    @Override
	public void action() {
		System.out.println("Sus fondos actuales son de: " + account.funds + " MXN");
	}
}
