package com.sqli.train;

import java.util.List;
import java.util.stream.Collectors;

public class TrainPrinter {

    public String print(Train t){
        return t.getWagons().stream().map(Wagon::print).collect(Collectors.joining(WagonParams.CONNECTOR));
    }

}
