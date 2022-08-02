//Concrete factory 1

package com.unisabana.patrones.creational.concrete_factory;

import com.unisabana.patrones.creational.abstract_product.Aerodynamic;
import com.unisabana.patrones.creational.abstract_product.Engine;
import com.unisabana.patrones.creational.abstract_factory.F1Factory;
import com.unisabana.patrones.creational.concrete_product.FerrariAerodynamic;
import com.unisabana.patrones.creational.concrete_product.FerrariEngine;

public class FerrariFactory implements F1Factory{

    @Override
    public Engine configureEngine() {
        return new FerrariEngine();
    }

    @Override
    public Aerodynamic configureAerodynamic() {
        return new FerrariAerodynamic();
    }
    
}
