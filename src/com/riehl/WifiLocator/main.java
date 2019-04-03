package com.riehl.WifiLocator;

import com.riehl.WifiLocator.NetorkDiscovery.NetworkDiscovery;

public class main {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            NetworkDiscovery.readNetworks();

        }

    }
}
