package Proxy.Interface;

import Proxy.Model.Driver;

public class Championship22 implements IDriver{

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
