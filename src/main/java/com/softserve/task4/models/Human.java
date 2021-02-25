package com.softserve.task4.models;

public class Human {
    protected boolean gender;
    protected String firstName;
    protected String lastName;
    protected float height;
    protected float weight;

    public Human(boolean gender, String firstName, String lastName, float height, float weight) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }
//
    public boolean speak(Human human) {
        if (this.gender && human.gender) {
            return Math.random() <= 0.5;
        }
        return true;
    }

//
    protected boolean tolerate(Human human) {
        if (this.gender && human.gender) {
            //if both male
            return Math.random() <= 0.056;
        } else if (!this.gender && !human.gender) {
            //if both female
            return Math.random() <= 0.05;
        } else {
            return Math.random() <= 0.7;
        }
//        return  true;
    }
//
    public boolean spendTimeTogether(Human human) {
            if (differPercentage(this.height, human.height) > 10) {
                return Math.random() <= 0.95;
            } else {
                return Math.random() <= 0.85;
            }
    }

        public float differPercentage(float v1, float v2) {
        float result = ((v1 - v2) / ((v1 + v2) / 2)) * 100;
        return result < 0 ? -result : result;
    }
    //

    /*MINE*/
    public Human giveBirthTo(Human human) {
        return null;
    }

    public Human haveRelationship(Human human) {
        if (this.gender == human.gender) {
            System.out.println("Sorry, did not work out");
            return null;
        } else if (this.speak(human) && this.tolerate(human) && this.spendTimeTogether(human)) {
            Human child = this.isGender() ? human.giveBirthTo(this) : this.giveBirthTo(human);
            System.out.println("That is how your child may look like: " + child.toString());
            return child;
        } else {
            System.out.println("Sorry, did not work out. Broken up.");
            return null;
        }
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

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

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String whatGender() {
        return this.isGender() ? "male" : "female";
    }

    @Override
    public String toString() {
        return "{" +
                "gender: " + whatGender() +
                ", firstName: " + firstName.substring(0, 1).toUpperCase() +firstName.substring(1, firstName.length()).toLowerCase()  +
                ", lastName: " + lastName.substring(0, 1).toUpperCase() +lastName.substring(1, lastName.length()).toLowerCase() +
                ", height: " + height +
                ", weight: " + weight +
                '}';
    }
}
