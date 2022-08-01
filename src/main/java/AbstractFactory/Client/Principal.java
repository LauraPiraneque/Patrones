package AbstractFactory.Client;

import AbstractFactory.AbstractFactory.F1Factory;
import AbstractFactory.ConcreteFactory.FerrariFactory;
import AbstractFactory.ConcreteFactory.RedBullFactory;
import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        BuildCar car = chooseCar();
        car.print();
    }
    
    private static BuildCar chooseCar(){
        BuildCar buildCar;
        F1Factory factory;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingresa el nombre del equipo:");
        String name = keyboard.nextLine();
        
        if(name.equalsIgnoreCase("Ferrari")){
            factory = new FerrariFactory();
            buildCar = new BuildCar(factory);
        } else {
            factory = new RedBullFactory();
            buildCar = new BuildCar(factory);
        }
 
        return buildCar;
    }
}
