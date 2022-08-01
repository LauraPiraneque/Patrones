//Concrete product A2

package AbstractFactory.ConcreteProduct;

import AbstractFactory.AbstractProduct.Engine;

public class RedBullEngine implements Engine{

    @Override
    public void print() {
        System.out.println("Este es el motor de Red Bull.");
    }
    
}
