package com.riehl.WifiLocator;

import com.riehl.WifiLocator.NetorkDiscovery.MacNetworkDiscovery;

public class main {

    public static void main(String[] args) {

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")){
            for (int i = 0; i < 10; i++) {
                MacNetworkDiscovery.readNetworks();
            }
        } else {
            System.out.println("Sorry your Operating System is not supported yet.");
        }
    }
}
