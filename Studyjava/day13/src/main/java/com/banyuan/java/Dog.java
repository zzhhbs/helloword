package com.banyuan.java;

public class Dog {
    private  String name;
    private int health;
    private int love;
    private String strain;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }


    public Dog(){

    }
    public Dog(String name, int health, int love,String strain){
        this.name = name;
        this.health = health;
        this.love = love;
        this.strain=strain;
    }

    public Dog(String name,String strain){
        this.name = name;

        this.strain=strain;
    }



}
