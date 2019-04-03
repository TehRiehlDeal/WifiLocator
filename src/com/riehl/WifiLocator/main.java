package com.riehl.WifiLocator;

import com.riehl.WifiLocator.NetorkDiscovery.NetworkDiscovery;

public class main {

    public static void main(String[] args) {

        String os = System.getProperty("os.name").toLowerCase();
        System.out.println(os);
        if (os.contains("mac")){
            for (int i = 0; i < 10; i++) {
                NetworkDiscovery.readNetworks();
            }
        } else {
            System.out.println("Sorry your Operating System is not supported yet.");
        }
    }
}
