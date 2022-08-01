package Proxy.Client;

import Proxy.Interface.Standings;
import Proxy.Interface.IDriver;
import Proxy.Model.Driver;
import Proxy.Proxy.ProxyStandings;

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
