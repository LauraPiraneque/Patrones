package com.unisabana.patrones.structural.service;

import com.unisabana.patrones.structural.model.Driver;

public interface IDriver {
    Driver removePoints(Driver driver, int points);
    Driver addPoints(Driver driver, int points);
    void showPoints(Driver driver);
}
