//Abstract factory

package com.unisabana.patrones.creational.abstract_factory;

import com.unisabana.patrones.creational.abstract_product.Engine;
import com.unisabana.patrones.creational.abstract_product.Aerodynamic;

public interface F1Factory {
    Engine configureEngine();
    Aerodynamic configureAerodynamic();
}
