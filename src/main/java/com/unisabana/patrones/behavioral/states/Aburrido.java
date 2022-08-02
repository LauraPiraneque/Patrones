package com.unisabana.patrones.behavioral.states;

import com.unisabana.patrones.behavioral.entity.Perro;

public class Aburrido implements State{
    private Perro perro;

    @Override
    public void jugar() {
        System.out.println("¡Es hora de jugar!");
        this.perro.setState(new Cansado());
    }

    @Override
    public void alimentar() {
        System.out.println("¡No quiero comer, quiero jugar!");
    }

    @Override
    public void dormir() {
        System.out.println("¡No quiero dormir, quiero jugar!");
    }

    @Override
    public void comoEstas() {
        System.out.println("¡Estoy muy aburrido!");
    }

    @Override
    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
}
