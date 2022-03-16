package com.sqli.train;

public class Passenger implements Wagon{
    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return WagonParams.PASSENGER;
    }
}
