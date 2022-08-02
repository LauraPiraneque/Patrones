//Concrete product B2

package com.unisabana.patrones.creational.concrete_product;

import com.unisabana.patrones.creational.abstract_product.Aerodynamic;

public class RedBullAerodynamic implements Aerodynamic{

    @Override
    public void print() {
        System.out.println("Este es el diseño aerodinámico de Red Bull.");
    }
    
}
