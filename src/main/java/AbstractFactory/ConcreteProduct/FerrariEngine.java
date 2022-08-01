//Concrete product A1

package AbstractFactory.ConcreteProduct;

import AbstractFactory.AbstractProduct.Engine;

public class FerrariEngine implements Engine{

    @Override
    public void print() {
        System.out.println("Este es el motor de Ferrari.");
    }
    
}
