package com.unisabana.patrones.behavioral.states;

import com.unisabana.patrones.behavioral.entity.Perro;

public class Hambriento implements State{
    private Perro perro;

    @Override
    public void jugar() {
        System.out.println("¡No quiero jugar, quiero comer!");
    }

    @Override
    public void alimentar() {
        System.out.println("¡Delicioso!");
        this.perro.setState(new Aburrido());
    }

    @Override
    public void dormir() {
        System.out.println("¡Tengo demasiada hambre para dormir!");
    }

    @Override
    public void comoEstas() {
        System.out.println("¡Tengo muchísima hambre!");
    }

    @Override
    public void setPerro(Perro perro) {
        this.perro = perro;
    }

}
