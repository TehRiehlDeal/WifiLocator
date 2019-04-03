# WifiLocator
The goal of this project is to eventually show a general location of wifi networks
around the user based on the signal power as well as change of location of 
the user.

It will achieve this by making a list of discovered networks in the area and 
create a WifiNetwork object that stores the SSID as well as the signal power.
Then it will continue to scan for networks and compare the change in signal 
strength. Using that along side a gps/accelerometer it should be able to give a 
rough estimate of the location of the wifi network.

# Disclaimer
This will be done using only 1 wifi antenna so it will only be able to give a
rough guess to the direction and location of the wifi network, there is no
signal triangulation involved.