package Proxy.Client;

import Proxy.Interface.Championship22;
import Proxy.Interface.IDriver;
import Proxy.Model.Driver;
import Proxy.Proxy.ChampionshipProxy;

public class Principal {
    public static void main(String[] args){
        
        Driver driver = new Driver(11, "Checo Pérez", 173);
        
        IDriver proxyChampionship = new ChampionshipProxy(new Championship22());
        proxyChampionship.showPoints(driver);
        driver = proxyChampionship.addPoints(driver, 25);
        driver = proxyChampionship.removePoints(driver, 10);
        proxyChampionship.showPoints(driver);
        
    }
}
