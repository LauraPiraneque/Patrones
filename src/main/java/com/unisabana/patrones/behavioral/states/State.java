package com.unisabana.patrones.behavioral.states;

import com.unisabana.patrones.behavioral.entity.Perro;

public interface State {
    void jugar();
    void alimentar();
    void dormir();
    void comoEstas();
    
    void setPerro(Perro perro);
}
