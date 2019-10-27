package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {

    private String name;
    private int age;

    String vitalStatus;
    String race;
    String eyeColor;
    Boolean employed;
    String hairColor;


    public Person() {
        this.name = "";
        this.age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Person(String vitalStatus, String race, String eyeColor, Boolean employed, String hairColor){
        this.vitalStatus = "Alive";
        this.race = "African American";
        this.eyeColor = "Brown";
        this.employed = true;
        this.hairColor = "Black";
    }

    public void vitalStatus(String vitalStatus) {
        this.vitalStatus = vitalStatus;
    }

    public String getVitalStatus() {
        return vitalStatus;
    }

    public void race(String race) {
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void eyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void employed(Boolean employed) {
        this.employed = employed;
    }
    public Boolean getEmployed() {
        return employed;
    }
    public void hairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    public String getHairColor() {
        return hairColor;
    }
}
