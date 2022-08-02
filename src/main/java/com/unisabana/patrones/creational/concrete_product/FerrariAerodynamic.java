//Concrete product B1

package com.unisabana.patrones.creational.concrete_product;

import com.unisabana.patrones.creational.abstract_product.Aerodynamic;

public class FerrariAerodynamic implements Aerodynamic{

    @Override
    public void print() {
        System.out.println("Este es el diseño areodinámico de Ferrari.");
    }
}
