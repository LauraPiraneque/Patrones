package com.unisabana.patrones.structural.client;

import com.unisabana.patrones.structural.service.Standings;
import com.unisabana.patrones.structural.service.IDriver;
import com.unisabana.patrones.structural.model.Driver;
import com.unisabana.patrones.structural.proxy.ProxyStandings;

public class Principal {
    public static void main(String[] args){
        
        Driver driver = new Driver(11, "Checo Pérez", 173);
        
        IDriver proxyStandings = new ProxyStandings(new Standings());
        proxyStandings.showPoints(driver);
        driver = proxyStandings.addPoints(driver, 25);
        driver = proxyStandings.removePoints(driver, 10);
        proxyStandings.showPoints(driver);
        
    }
}
