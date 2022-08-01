// //Concrete factory 2

package AbstractFactory.ConcreteFactory;

import AbstractFactory.AbstractProduct.Aerodynamic;
import AbstractFactory.AbstractProduct.Engine;
import AbstractFactory.ConcreteProduct.RedBullAerodynamic;
import AbstractFactory.ConcreteProduct.RedBullEngine;
import AbstractFactory.AbstractFactory.F1Factory;

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
