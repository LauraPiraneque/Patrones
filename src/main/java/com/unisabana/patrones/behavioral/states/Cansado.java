package com.unisabana.patrones.behavioral.states;

import com.unisabana.patrones.behavioral.entity.Perro;

public class Cansado implements State {
    private Perro perro;
    
    @Override
    public void jugar() {
        System.out.println("Estoy muy cansado...");
    }

    @Override
    public void alimentar() {
        System.out.println("No quiero comer, estoy demasiado cansado...");
    }

    @Override
    public void dormir() {
        System.out.println("Al fin podré descansar, buenas noches...");
        this.perro.setState(new Durmiendo());
    }

    @Override
    public void comoEstas() {
        System.out.println("Estoy cansado y tengo mucho sueño...");
    }

    @Override
    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
}
