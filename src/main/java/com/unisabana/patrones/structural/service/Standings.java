package com.unisabana.patrones.structural.service;

import com.unisabana.patrones.structural.model.Driver;

public class Standings implements IDriver{

    @Override
    public Driver removePoints(Driver driver, int points) {
        int currentPoints = driver.getPoints() - points;
        driver.setPoints(currentPoints);
        return driver;
    }

    @Override
    public Driver addPoints(Driver driver, int points) {
        int currentPoints = driver.getPoints() + points;
        driver.setPoints(currentPoints);
        return driver;
    }

    @Override
    public void showPoints(Driver driver) {
        System.out.println("El número de puntos del piloto " + driver.getName() + " es " + driver.getPoints());
    }
    
}
