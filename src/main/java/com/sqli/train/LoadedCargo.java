package com.sqli.train;

public class LoadedCargo extends Cargo{
    @Override
    public boolean canBeFilled() {
        return false;
    }

    @Override
    public String print() {
        return WagonParams.LOADED_CARGO;
    }
}
