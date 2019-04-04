package com.riehl.WifiLocator;

import com.riehl.WifiLocator.NetorkDiscovery.MacNetworkDiscovery;

public class main {

    static String network = "";
    public static void main(String[] args) {

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("mac")){
            while(true) {
                if (!network.isEmpty()){
                    MacNetworkDiscovery.readNetworks(network);
                } else {
                    network = MacNetworkDiscovery.readNetworks("");
                }

            }
        } else {
            System.out.println("Sorry your Operating System is not supported yet.");
        }
    }
}
