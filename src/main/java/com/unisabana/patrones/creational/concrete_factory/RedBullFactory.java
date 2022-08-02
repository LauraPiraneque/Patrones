// //Concrete factory 2

package com.unisabana.patrones.creational.concrete_factory;

import com.unisabana.patrones.creational.abstract_product.Aerodynamic;
import com.unisabana.patrones.creational.abstract_product.Engine;
import com.unisabana.patrones.creational.concrete_product.RedBullAerodynamic;
import com.unisabana.patrones.creational.concrete_product.RedBullEngine;
import com.unisabana.patrones.creational.abstract_factory.F1Factory;

public class RedBullFactory implements F1Factory{

    @Override
    public Engine configureEngine() {
        return new RedBullEngine();
    }

    @Override
    public Aerodynamic configureAerodynamic() {
        return new RedBullAerodynamic();
    }
    
}
