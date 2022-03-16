package com.sqli.train;


import java.util.ArrayList;
import java.util.List;

public class TrainFactory {
            public List<Wagon> create(String wagon){
                List<Wagon> result=new ArrayList<>();
                for(int index=0;index<wagon.length();index++){
                    switch (wagon.charAt(index)) {
                        case 'H':
                            if(index==0)
                            result.add(new FirstHead());
                            else if(index==wagon.length()-1)
                                result.add(new LastHead());
                            break;
                        case 'P':
                            result.add(new Passenger());
                            break;
                        case 'R':
                            result.add(new Restaurant());
                            break;
                        case 'C':
                            result.add(new EmptyCargo());
                    }
                }
                return result;
            }
}
