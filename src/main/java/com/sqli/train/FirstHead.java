package com.sqli.train;

public class FirstHead extends Head{
    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return WagonParams.FIRST_HEAD;
    }
}
