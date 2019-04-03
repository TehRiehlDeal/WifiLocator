package com.riehl.WifiLocator.WifiNetwork;

public class WifiNetwork {

    String ssid;
    int power;
    public WifiNetwork(String ssid, int power){
        this.ssid = ssid;
        this.power = power;
    }

    public String getSsid() {
        return ssid;
    }

    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "WifiNetwork{" +
                "ssid='" + ssid + '\'' +
                ", power=" + power +
                '}';
    }
}
