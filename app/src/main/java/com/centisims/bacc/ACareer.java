package com.centisims.bacc;

import java.util.List;

public class ACareer implements Career {

    private final String name;
    private final int ep;
    private final String[] title;
    private static List<ACareer> careers;

    private ACareer (String name, int ep, String...levels){
        this.name = name;
        this.ep = ep;
        String[] title = new String[10];
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
        for (ACareer career : careers) {
            if (career.getName().equals(name)) {
                return career;
            }
        }
        return null;
    }

    public static ACareer
        //Base Game
        NOCAREER = new ACareer("No Career", 0, ""),
        ATHLETIC = new ACareer("Athletic", 0, "Team Mascot", "Minor Leaguer", "Rookie", "Starter", "All Star", "MVP", "Superstar", "Assistant Coach", "Coach", "Hall of Famer"),
        BUSINESS = new ACareer("Business", 0, "Mailroom Technician", "Executive Assistant", "Field Sales Representative", "Junior Executive", "Executive", "Senior Manager", "Vice President", "President", "CEO", "Business Tycoon"),
        CRIMINAL = new ACareer("Criminal", 0, "Pickpocket", "Bagman", "Bookie", "Con Artist", "Getaway Driver", "Bank Robber", "Cat Burglar", "Counterfeiter", "Smuggler", "Criminal Mastermind"),
        CULINARY = new ACareer("Culinary", 0, "Dishwasher", "Drive Through Clerk", "Fast Food Shift Manager", "Host / Hostess", "Waiter / Waitress", "Prep Cook", "Sous Chef", "Executive Chef", "Restauranteur", "Celebrity Chef"),
        LAWENFORCEMENT = new ACareer("Law Enforcement", 0, "Security Guard", "Cadet", "Patrol Officer", "Desk Sergeant", "Vice Squad", "Detective", "Lieutenant", "SWAT Team Leader", "Police Chief", "Captain Hero"),
        MEDICINE = new ACareer("Medicine", 0, "Emergency Medical Technician", "Paramedic", "Nurse", "Intern", "Resident", "General Practitioner", "Specialist", "Surgeon", "Medical Researcher", "Chief of Staff"),
        MILITARY = new ACareer("Military", 0, "Recruit", "Elite Forces", "Drill Instructor", "Junior Officer", "Counter Intelligence", "Flight Officer", "Senior Officer", "Commander", "Astronaut", "General"),
        POLITICS = new ACareer("Politics", 0, "Campaign Worker", "Intern", "Lobbyist", "Campaign Manager", "City Council Member", "State Assemblyperson", "Congressperson", "Judge", "Senator", "Mayor"),
        SCIENCE = new ACareer("Science", 0, "Test Subject", "Lab Assistant", "Field Researcher", "Science Teacher", "Project Leader", "Inventor", "Scholar", "Top Secret Researcher", "Theorist", "Mad Scientist"),
        SLACKER = new ACareer("Slacker", 0, "Golf Caddy", "Gas Station Attendant", "Convenience Store Clerk", "Record Store Clerk", "Party DJ", "Projectionist", "Home Video Editor", "Freelance Photographer", "Freelance Web Designer", "Professional Party Guest"),
        //University
        ARTIST = new ACareer("Artist", 1, "Canvas Stretcher", "Street Caricaturist", "Souvenir Whittler", "Comic Book Penciller", "Wedding Photographer", "Art Forger", "Fashion Photographer", "Acclaimed Muralist", "Conceptual Artist", "Visionary"),
        SHOWBUSINESS = new ACareer("Show Business", 1, "Screen Test Stand-In", "Body Double", "Bit Player", "Commercial Actor/Actress", "Cartoon Voice", "Supporting Player", "Broadway Star", "Leading Man/Lady", "Blockbuster Director", "Icon"),
        NATURALSCIENTIST = new ACareer("Natural Scientist", 1, "Ratkeeper", "Algae Hunter", "Clam Wrangler", "Scatmaster", "Soil Identifier", "Rogue Botanist", "Animal Linguist", "Unnatural Crossbreeder", "Dinosaur Cloner", "Ecological Guru"),
        PARANORMAL = new ACareer("Paranormal", 1, "Psychic Phone Pal", "Conspiracy Theorist", "Tarot Card Reader", "Hypnotist", "Medium", "Douser", "Police Psychic", "UFO Investigator", "Exorcist", "Cult Leader"),
        //Open for Business
        BUSINESSOWNER = new ACareer("Sim-Owned Business", 3, "Owner"),
        BUSINESSEMPLOYEE = new ACareer("Sim-Owned Business", 3, "Employee"),
        //Seasons
        ADVENTURER = new ACareer("Adventurer", 5, "Ambassador's Intern", "Spelunker", "Multiregional Sim of Some Question", "Deep Sea Excavator", "Relic Liberator", "Dread Pirate", "Warhead Disarmer", "Hostage Negotiator", "International Sim of Mystery", "Space Pirate"),
        EDUCATION = new ACareer("Education", 5, "Playground Monitor", "Teacher's Aide", "Substitute Teacher", "Elementary School Teacher", "High School Teacher", "University Guest Lecturer", "High School Principal", "College Senior Professor", "College Dean of Students", "Education Minister"),
        GAMER = new ACareer("Gamer", 5, "Noob", "Button Masher", "Trash Talker", "Gold Farmer", "Flag Capturer", "Platform Jumper", "Power Leveler", "Real Time Strategizer", "Guild Leader", "Game Designer"),
        JOURNALISM = new ACareer("Journalism", 5, "Yearbook Club Supervisor", "Blog Writer", "Internet Movie Critic", "Fact Checker", "Obituary Writer", "Horoscope Writer", "Sports Columnist", "Investigatory Journalist", "Magazine Editor", "Media Magnate"),
        LAW = new ACareer("Law", 5, "File Clerk", "Law Firm Receptionist", "Legal Secretary", "Legal Biller", "Paralegal", "Personal Injury Attorney", "Family Law Attorney", "International Corporate Lawyer", "Entertainment Attorney", "The Law"),
        MUSIC = new ACareer("Music", 5, "Record Store Clerk", "Piano Tuner", "Coffee Shop Sound Engineer", "Summer Camp Music Teacher", "Battle of the Bands Judge", "Roadie", "Studio Musician", "Concert Pianist", "Symphony Conductor", "Rock God"),
        //FreeTime
        ARCHITECTURE = new ACareer("Architecture", 7, "Cement Mixer", "Brick Layer", "Foreman", "Head of Construction Company", "Architect's Apprentice", "Draftsman", "Architect", "Architectural Partner", "Master Architect", "City Planner"),
        DANCE = new ACareer("Dance", 7, "Aerobics Instructor", "Backup Dancer", "Jazzercise Instructor", "Pop 'n Lock Performer", "Dance Video Star", "Interpretive Dancer", "Tap Dancer", "Ballroom Dancer", "Flamenco Master", "World Class Ballet Dancer"),
        ENTERTAINMENT = new ACareer("Entertainment", 7, "Stand Up Comedian", "Birthday Party Mascot", "Mime", "Lounge Singer", "Ventriloquist", "Round Table Knight", "Juggler", "Master of Ceremonies", "Headliner", "Prestidigitator"),
        INTELLIGENCE = new ACareer("Intelligence", 7, "Gumshoe", "Private Eye", "Crime Scene Investigator", "Surveillance Operator", "Reconnaissance Communicator", "Rookie Field Agent", "Field Agent", "Double Agent", "Elite Operative", "Head of SCIA"),
        OCEANOGRAPHY = new ACareer("Oceanography", 7, "Fish Chummer", "Dolphin Tank Cleaner", "Sea Lice Research Assistant", "Dive Master", "Underwater Demolitionist", "Marine Biologist", "Whale Tracker", "Deep Sea Fisherman", "Protector of Whales", "Hand of Poseidon");

}
