package com.centisims.bacc;

import java.util.ArrayList;
import java.util.Collection;

public class Household {

    private Neighborhood neighborhood;
    private String name;
    private Collection<Sim> sims;

    public Household(Neighborhood neighborhood, String name){
        this.neighborhood = neighborhood;
        this.name = name;
        sims = new ArrayList<>();
    }

    //Neighborhood

    public Neighborhood getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(Neighborhood neighborhood) {
        if (this.neighborhood != null){
            this.neighborhood.removeHousehold(this);
        }
        if (neighborhood != null){
            neighborhood.addHousehold(this);
        }
        this.neighborhood = neighborhood;
    }

    //Name

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Members

    public void addSim(Sim sim) {
        if (!sims.contains(sim)) {
            sims.add(sim);
            sim.setHousehold(this);
        }
    }

    public void removeSim(Sim sim) {
        if (sims.contains(sim)) {
            sims.remove(sim);
            sim.setHousehold(null);
        }
    }

}
