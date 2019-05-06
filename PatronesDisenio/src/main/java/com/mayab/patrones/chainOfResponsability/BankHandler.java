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
public abstract class BankHandler {
    protected Account account;
	protected BankHandler nextAction;
	public final void setNext(int action) {
		if(action == 1) {
			nextAction = new ConsultBank();
			nextAction.setAccount(account);
		}
		else if (action == 2) {
			nextAction = new WithdrawBank();
			nextAction.setAccount(account);
		}
		else {
			System.out.println("Error acción no valida");
		}
	}
	public final void setAccount(Account account) {
		this.account = account;
	}
	public abstract void action();
}
