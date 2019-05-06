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
public class DebitAccount extends Account{
    @Override
	public boolean acceptTransaction(int request){
		if((double)request > funds) {
			return false;
		}
		else {
			return true;
		}
	}
}
