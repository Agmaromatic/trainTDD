package com.sqli.train;

public class EmptyCargo extends Cargo{
    @Override
    public boolean canBeFilled() {
        return true;
    }

    @Override
    public String print() {
        return WagonParams.EMPTY_CARGO;
    }

}
