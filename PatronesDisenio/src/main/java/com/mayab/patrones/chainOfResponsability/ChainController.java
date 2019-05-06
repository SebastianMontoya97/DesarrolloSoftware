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
public class ChainController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account Benji = new DebitAccount();
		Benji.setNIP(1234);
		Benji.setFunds(15000);
		BankHandler ATM = new WithdrawBank();
		System.out.println("Bienvenido a nuestra red de ATMs");
		if(Benji.validate(1234)) {
			ATM.setAccount(Benji);
			ATM.setNext(1);
			ATM.action();
		}
		else {
			System.out.println("Error en NIP");
		}
	}
}
