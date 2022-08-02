package com.unisabana.patrones.creational.client;

import com.unisabana.patrones.creational.abstract_factory.F1Factory;
import com.unisabana.patrones.creational.concrete_factory.FerrariFactory;
import com.unisabana.patrones.creational.concrete_factory.RedBullFactory;
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
