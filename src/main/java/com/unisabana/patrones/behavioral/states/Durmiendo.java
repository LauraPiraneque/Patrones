package com.unisabana.patrones.behavioral.states;

import com.unisabana.patrones.behavioral.entity.Perro;
import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {
    private Perro perro;
    
    @Override
    public void jugar() {}

    @Override
    public void alimentar() {}

    @Override
    public void dormir() {}

    @Override
    public void comoEstas() {
        System.out.println("Shhhh, no puede hablar... ¡Está durmiendo!");
    }

    @Override
    public void setPerro(Perro perro) {
        this.perro = perro;
        
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.perro.setState(new Hambriento());
            }
        }, 7000);
        
        //Se va a despertar a los 7 segundos
    }
    
}
