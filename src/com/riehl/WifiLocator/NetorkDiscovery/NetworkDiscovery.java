package com.riehl.WifiLocator.NetorkDiscovery;

import com.riehl.WifiLocator.WifiNetwork.WifiNetwork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class NetworkDiscovery {

    static List<WifiNetwork> wifiNetworks = new ArrayList<WifiNetwork>();
    static List<String> networkName = new ArrayList<String>();
    static final String reg = "((.){2}:){5}((\\w\\d)|(\\d\\w)|(\\d\\d))";
    static String s;

    public static void readNetworks() {
        try {
            Process p = Runtime.getRuntime().exec("airport -s");

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

            while ((s = stdInput.readLine()) != null) {
                if (!s.contains("SSID")) {
                    String[] k = s.split(reg);

                    String ssid = k[0].trim();
                    String[] t = k[1].split(" ");
                    int power = parseInt(t[1]);
                    WifiNetwork network = new WifiNetwork(ssid, power);
                    if (!networkName.contains(ssid)) {
                        wifiNetworks.add(network);
                    }
                    networkName.add(ssid);
                }
            }
            while ((s = stdError.readLine()) != null) {
                System.out.println(s);
            }

            System.out.println("-----------------------------------------");
            wifiNetworks.forEach((n) -> System.out.println(n.toString()));
            networkName.clear();
            wifiNetworks.clear();
            p.destroy();

        } catch (
                IOException e) {
            System.out.println("exception happened - here's what I know: ");
            e.printStackTrace();
            System.exit(-1);
        }
    }
}
