package com.centisims.bacc;

import java.util.ArrayList;
import java.util.Collection;

public class Neighborhood {

    private String name;
    private String type;
    private Collection<Household> households;

    public Neighborhood(String name, String type){
        this.name = name;
        this.type = type;
        households = new ArrayList<>();
    }

    //Name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Type

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //Households

    public void addHousehold(Household household) {
        if (!households.contains(household)) {
            households.add(household);
            household.setNeighborhood(this);
        }
    }

    public void removeHousehold(Household household) {
        if (households.contains(household)) {
            households.remove(household);
            household.setNeighborhood(null);
        }
    }

}
