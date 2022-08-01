package Proxy.Proxy;

import Proxy.Interface.Championship22;
import Proxy.Interface.IDriver;
import Proxy.Model.Driver;

public class ChampionshipProxy implements IDriver{

    private IDriver realChampionship;

    public ChampionshipProxy(IDriver realChampionship) {
        this.realChampionship = realChampionship;
    }
    
    @Override
    public Driver removePoints(Driver driver, int points) {
        if(realChampionship == null){
            this.realChampionship = new Championship22();
            return this.realChampionship.removePoints(driver, points);
        } else
            return this.realChampionship.removePoints(driver, points);
    }

    @Override
    public Driver addPoints(Driver driver, int points) {
        if(realChampionship == null){
            this.realChampionship = new Championship22();
            return this.realChampionship.addPoints(driver, points);
        } else
            return this.realChampionship.addPoints(driver, points);
    }

    @Override
    public void showPoints(Driver driver) {
        if(realChampionship == null){
            this.realChampionship = new Championship22();
            this.realChampionship.showPoints(driver);
        } else
            this.realChampionship.showPoints(driver);
    }
    
}
