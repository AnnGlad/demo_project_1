package com.softserve.task4.models;

public class Man extends Human {
    public Man(String firstName, String lastName, float height, float weight) {
        super(true, firstName, lastName, height, weight);
    }

    public Human executeMission(Human human) {
        if (this.speak(human) && this.spendTimeTogether(human)) {
            System.out.println("Achievement unlocked! Man has built a house!");

        } else if (this.speak(human) && !this.tolerate(human)) {
            System.out.println("Achievement unlocked! Man has plant a tree!");
        } else if (this.gender && !human.gender) {
            Human child = this.haveRelationship(human);
            if (child != null && child.isGender()) {
                System.out.println("Achievement unlocked! Man has risen a son!");
                return child;
            }
            return null;
        }
        return null;
    }

}
