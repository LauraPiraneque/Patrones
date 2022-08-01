//Concrete product B2

package AbstractFactory.ConcreteProduct;

import AbstractFactory.AbstractProduct.Aerodynamic;

public class RedBullAerodynamic implements Aerodynamic{

    @Override
    public void print() {
        System.out.println("Este es el diseño aerodinámico de Red Bull.");
    }
    
}
