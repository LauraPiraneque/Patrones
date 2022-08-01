//Concrete factory 1

package AbstractFactory.ConcreteFactory;

import AbstractFactory.AbstractProduct.Aerodynamic;
import AbstractFactory.AbstractProduct.Engine;
import AbstractFactory.AbstractFactory.F1Factory;
import AbstractFactory.ConcreteProduct.FerrariAerodynamic;
import AbstractFactory.ConcreteProduct.FerrariEngine;

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
