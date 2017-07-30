package com.centisims.bacc;

public class Sim {

    private Household household;
    private String firstName;
    private String lastName;
    private char age;
    private Career career;
    private int level;

    public Sim(Household household, String firstName, String lastName, char age){
        this.household = household;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        if (age == 'a') {
            career = ACareer.NOCAREER;
        }
        else {
            career = TECareer.TENOCAREER;
        }
        level = 1;
    }

    //Households

    public Household getHousehold() {
        return household;
    }

    public void setHousehold(Household household) {
        if (this.household != null) {
            this.household.removeSim(this);
        }
        if (household != null) {
            household.addSim(this);
        }
        this.household = household;
    }

    //Name

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Age

    public char getAge() {
        return age;
    }

    public void ageUp() {
        char age = this.age;
        switch (age) {
            case 'b':   this.age = 'o';
                        break;
            case 'o':   this.age = 'c';
                        break;
            case 'c':   this.age = 't';
                        break;
            case 'y':   this.age = 'a';
                        break;
            case 'a':   this.age = 'e';
                        break;
            default:    break;
        }
    }

    public void ageUp(boolean uni) {
        if (uni) {
            this.age = 'y';
            setCareer(TECareer.TENOCAREER);
            setLevel(1);
        }
        else {
            this.age = 'a';
            setCareer(career.getCareer(career.getName()));
            setLevel(1);
        }
    }

    //Career

    public String getCareer() {
        return career.getName();
    }

    public void setCareer(Career career) {
        this.career = career;
    }

    public String getTitle() {
        return career.getTitle(level);
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
