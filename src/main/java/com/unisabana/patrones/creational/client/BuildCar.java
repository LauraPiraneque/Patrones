package com.unisabana.patrones.creational.client;

import com.unisabana.patrones.creational.abstract_factory.F1Factory;
import com.unisabana.patrones.creational.abstract_product.Aerodynamic;
import com.unisabana.patrones.creational.abstract_product.Engine;

public class BuildCar {
    private Engine engine;
    private Aerodynamic aerodynamic;

    public BuildCar(F1Factory factory) {
        this.engine = factory.configureEngine();
        this.aerodynamic = factory.configureAerodynamic();
    }
    
    public void print(){
        this.engine.print();
        this.aerodynamic.print();
    }
}
