package com.centisims.bacc;

import java.util.List;

public class TECareer implements Career {

    private final String name;
    private final int ep;
    private final String[] title;
    private static List<TECareer> careers;

    private TECareer (String name, int ep, String...levels){
        this.name = name;
        this.ep = ep;
        String[] title = new String[3];
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
        return ep;
    }

    @Override
    public String getTitle(int level) {
        return title[level-1];
    }

    @Override
    public Career getCareer(String name) {
        for (TECareer career : careers) {
            if (career.getName().equals(name)) {
                return career;
            }
        }
        return null;
    }

    public static TECareer
        //Base Game
        TENOCAREER = new TECareer("No Career", 0),
        TEATHLETIC = new TECareer ("Athletic", 0, "Waterperson", "Locker Room Attendant", "Team Mascot"),
        TEBUSINESS = new TECareer ("Business", 0, "Gofer", "Mailroom Technician", "Executive Assistant"),
        TECRIMINAL = new TECareer ("Criminal", 0, "Street Hawker", "Numbers Runner", "Pickpocket"),
        TECULINARY = new TECareer ("Culinary", 0, "Dishwasher", "Drive Through Clerk", "Fast Food Shift Manager"),
        TELAWENFORCEMENT = new TECareer("Law Enforcement", 0, "School Crossing Guard", "Parking Lot Attendant", "Security Guard"),
        TEMEDICINE = new TECareer("Medicine", 0, "Nursing Home Attendant", "Orderly", "Emergency Medical Technician"),
        TEMILITARY = new TECareer("Military", 0, "Paintball Attendant", "Recruit Training Corps", "Recruit"),
        TEPOLITICS = new TECareer("Politics", 0, "Door to Door Poller", "Campaign Worker", "Intern"),
        TESCIENCE = new TECareer("Science", 0, "Lab Glass Scrubber", "Test Subject", "Lab Assistant"),
        TESLACKER = new TECareer("Slacker", 0, "Golf Caddy", "Gas Station Attendant", "Convenience Store Clerk"),
        //Seasons
        TEADVENTURER = new TECareer ("Adventurer", 5, "Ambassador's Intern", "Spelunker", "Multiregional Sim of Some Question"),
        TEEDUCATION = new TECareer("Education", 5, "Playground Monitor", "Teacher's Aide", "Substitute Teacher"),
        TEGAMER = new TECareer("Gamer", 5, "Noob", "Button Masher", "Trash Talker"),
        TEJOURNALISM = new TECareer("Journalism", 5, "Yearbook Club Supervisor", "Blog Writer", "Internet Movie Critic"),
        TELAW = new TECareer("Law", 5, "File Clerk", "Law Firm Receptionist", "Legal Secretary"),
        TEMUSIC = new TECareer("Music", 5, "Record Store Clerk", "Piano Tuner", "Coffee Shop Sound Engineer"),
        //FreeTime
        TEARCHITECTURE = new TECareer ("Architecture", 7, "Cement Mixer", "Brick Layer", "Foreman"),
        TEDANCE = new TECareer ("Dance", 7, "Aerobics Instructor", "Backup Dancer", "Jazzercise Instructor"),
        TEENTERTAINMENT = new TECareer("Entertainment", 7, "Stand Up Comedian", "Birthday Party Mascot", "Mime"),
        TEINTELLIGENCE = new TECareer("Intelligence", 7, "Gumshoe", "Private Eye", "Crime Scene Investigator"),
        TEOCEANOGRAPHY = new TECareer("Oceanography", 7, "Fish Chummer", "Dolphin Tank Cleaner", "Sea Lice Research Assistant");

}
