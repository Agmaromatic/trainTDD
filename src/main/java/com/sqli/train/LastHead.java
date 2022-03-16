package com.sqli.train;

public class LastHead extends Head{
    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return WagonParams.LAST_HEAD;
    }
}
