/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;
import java.util.ArrayList;
import com.mayab.patrones.observer.Observable;
/**
 *
 * @author Sebastian M.M
 */
public class Vuelo implements Observable{
    public String sala;
    public String salida;
    public String estado;
    public String destino;
    public ArrayList<Observer> pasajeros = new ArrayList();
    public Vuelo(String sala, String salida, String estado, String destino){
        this.sala=sala;
        this.salida=salida;
        this.estado=estado;
        this.destino=destino;
    }
    public String getSala() {
        return sala;
    }
    public String getSalida() {
        return salida;
    }

    public String getEstado() {
        return estado;
    }

    public String getDestino() {
        return destino;
    }

    public void setSala(String sala) {
        this.sala = sala;
        this.notifyObservers();
    }

    public void setSalida(String salida) {
        this.salida = salida;
        this.notifyObservers();
    }

    public void setEstado(String estado) {
        this.estado = estado;
        this.notifyObservers();
    }

    public void setDestino(String destino) {
        this.destino = destino;
        this.notifyObservers();
    }
    @Override
    public void addObserverToList(Observer p){
        pasajeros.add(p);
    }
    @Override
    public void deleteObserverFromList(Observer p){
        pasajeros.remove(p);
    }
    @Override
    public void notifyObservers(){
        for(int i=0;i<pasajeros.size();i++){
            pasajeros.get(i).update();
        }
    }
    
}
