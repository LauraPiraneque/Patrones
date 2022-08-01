package Proxy.Interface;

import Proxy.Model.Driver;

public interface IDriver {
    Driver removePoints(Driver driver, int points);
    Driver addPoints(Driver driver, int points);
    void showPoints(Driver driver);
}
