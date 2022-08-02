//Concrete product A2

package com.unisabana.patrones.creational.concrete_product;

import com.unisabana.patrones.creational.abstract_product.Engine;

public class RedBullEngine implements Engine{

    @Override
    public void print() {
        System.out.println("Este es el motor de Red Bull.");
    }
    
}
