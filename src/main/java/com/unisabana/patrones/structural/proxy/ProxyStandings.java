package com.unisabana.patrones.structural.proxy;

import com.unisabana.patrones.structural.service.Standings;
import com.unisabana.patrones.structural.service.IDriver;
import com.unisabana.patrones.structural.model.Driver;

public class ProxyStandings implements IDriver{

    private IDriver realStandings;

    public ProxyStandings(IDriver realChampionship) {
        this.realStandings = realChampionship;
    }
    
    @Override
    public Driver removePoints(Driver driver, int points) {
        if(realStandings == null){
            this.realStandings = new Standings();
            return this.realStandings.removePoints(driver, points);
        } else
            return this.realStandings.removePoints(driver, points);
    }

    @Override
    public Driver addPoints(Driver driver, int points) {
        if(realStandings == null){
            this.realStandings = new Standings();
            return this.realStandings.addPoints(driver, points);
        } else
            return this.realStandings.addPoints(driver, points);
    }

    @Override
    public void showPoints(Driver driver) {
        if(realStandings == null){
            this.realStandings = new Standings();
            this.realStandings.showPoints(driver);
        } else
            this.realStandings.showPoints(driver);
    }
    
}
