package AbstractFactory.Client;

import AbstractFactory.AbstractFactory.F1Factory;
import AbstractFactory.AbstractProduct.Aerodynamic;
import AbstractFactory.AbstractProduct.Engine;

public class BuildCar {
    private Engine engine;
    private Aerodynamic aerodynamic;

    public BuildCar(F1Factory factory) {
        this.engine = factory.configureEngine();
        this.aerodynamic = factory.configureAerodynamic();
    }
    
    public void print(){
        this.engine.print();
        this.aerodynamic.print();
    }
}
