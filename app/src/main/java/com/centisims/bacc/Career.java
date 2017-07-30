package com.centisims.bacc;

public interface Career {

    public String getName();
    public int getEP();
    public String getTitle(int level);
    public Career getCareer(String name);

}
