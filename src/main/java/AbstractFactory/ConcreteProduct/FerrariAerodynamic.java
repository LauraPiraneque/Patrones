//Concrete product B1

package AbstractFactory.ConcreteProduct;

import AbstractFactory.AbstractProduct.Aerodynamic;

public class FerrariAerodynamic implements Aerodynamic{

    @Override
    public void print() {
        System.out.println("Este es el diseño areodinámico de Ferrari.");
    }
}
