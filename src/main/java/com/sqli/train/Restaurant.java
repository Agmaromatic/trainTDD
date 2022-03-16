package com.sqli.train;

public class Restaurant implements Wagon{

    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return WagonParams.RESTAURANT;
    }
}
