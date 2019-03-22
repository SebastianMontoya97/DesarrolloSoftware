/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;

/**
 *
 * @author Sebastian M.M
 */
public class ObserverController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Vuelo dubai = new Vuelo("A1","1:00pm","ATRASADO","DUBAI");
    Pasajero juan = new Pasajero("Juan",dubai);
    Pasajero violeta = new Pasajero("Violeta",dubai);
    Pasajero luis = new Pasajero ("Luis",dubai);
    dubai.addObserverToList(juan);
    dubai.addObserverToList(violeta);
    dubai.addObserverToList(luis);
    dubai.setDestino("Etiopia");
    }
    
}
