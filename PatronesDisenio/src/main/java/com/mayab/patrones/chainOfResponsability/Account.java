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
public abstract class Account {
    public double funds;
	protected int NIP;
	public boolean validate(int NIP) {
		if(this.NIP == NIP) {
			return true;
		}
		else {
			return false;
		}
	}
	public void setNIP(int NIP) {
		this.NIP = NIP;
	}
	public void setFunds(int funds) {
		this.funds = funds;
	}
	public abstract boolean acceptTransaction(int request);
}
