package com.unisabana.patrones.behavioral.entity;

import com.unisabana.patrones.behavioral.states.Aburrido;
import com.unisabana.patrones.behavioral.states.State;

public class Perro {
    private State estado;
    
    public Perro(){
        this.setState(new Aburrido());
    }
    
    public void setState(State estado){
        this.estado = estado;
        this.estado.setPerro(this);
    }
    
    public void alimentar(){
        this.estado.alimentar();
    }
    
    public void dormir(){
        this.estado.dormir();
    }
    
    public void jugar(){
        this.estado.jugar();
    }
    
    public void comoEstas(){
        this.estado.comoEstas();
    }
}
