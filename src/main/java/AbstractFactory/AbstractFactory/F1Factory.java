//Abstract factory

package AbstractFactory.AbstractFactory;

import AbstractFactory.AbstractProduct.Engine;
import AbstractFactory.AbstractProduct.Aerodynamic;

public interface F1Factory {
    Engine configureEngine();
    Aerodynamic configureAerodynamic();
}
