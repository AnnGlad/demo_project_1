package com.softserve.task4.service;

import com.softserve.task4.models.Human;

public class HumanService {

    public static void compatibilityTest(Human humanOne, Human humanTwo) {

        System.out.println("Checking if you may speack with each other");
        humanOne.speak(humanTwo);

//        humanOne.spendTimeTogether(humanTwo);
        System.out.println("Checking if you may have relationship...");
        humanOne.haveRelationship(humanTwo);
    }
}
