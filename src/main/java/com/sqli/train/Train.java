package com.sqli.train;

import java.util.ArrayList;
import java.util.List;

public class Train {

    private final List<Wagon> wagons;

    public List<Wagon> getWagons() {
        return wagons;
    }

    public Train(String wagon){
        TrainFactory trainFactory=new TrainFactory();
        this.wagons=trainFactory.create(wagon);
    }

    public String print(){
        TrainPrinter trainPrinter=new TrainPrinter();
        return trainPrinter.print(this);
    }

    public void detachHead(){
    wagons.remove(0);
    wagons.subList(1, wagons.size());
    }

    public void detachEnd(){
        wagons.remove(wagons.size()-1);
        wagons.subList(0, wagons.size()-2);
    }

    public boolean fill(){
        for(int index=0;index< wagons.size();index++){
           if(wagons.get(index).canBeFilled()){
               wagons.set(index,new LoadedCargo());
               return true;
           }
        }
        return false;
    }

}
