package com.centisims.bacc;

import java.util.List;

public class PCareer implements Career {

    private final String name;
    private final String[] title;
    private static List<PCareer> careers;

    private PCareer (String name, String...levels){
        this.name = name;
        String[] title = new String[4];
        int i = 0;
        for (String level : levels){
            title[i] = level;
        }
        this.title = title;
        careers.add(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getEP() {
        return 4;
    }

    @Override
    public String getTitle(int level) {
        return title[level-1];
    }

    @Override
    public Career getCareer(String name) {
        for (PCareer career : careers) {
            if (career.getName().equals(name)) {
                return career;
            }
        }
        return null;
    }

    public static PCareer
        SECURITY = new PCareer("Security", "Snooper Deterrent", "Guard Pet", "Contraband Sniffer", "Pet Corps"),
        SERVICE = new PCareer("Service", "Vermin Chaser", "Therapy Pet", "Seeing Eye Pet", "Rescue Pet"),
        SHOWBIZ = new PCareer("Show Biz", "Extra", "Understudy", "Stunt Double", "Star");

}
