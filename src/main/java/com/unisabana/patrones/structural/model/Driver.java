//Service

package com.unisabana.patrones.structural.model;

public class Driver {
    private int number;
    private String name;
    private int points;

    public Driver(int number, String name, int points) {
        this.number = number;
        this.name = name;
        this.points = points;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
}
