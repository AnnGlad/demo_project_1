package com.softserve.task4;

import com.softserve.task4.models.Man;
import com.softserve.task4.models.Woman;
import com.softserve.task4.service.HumanService;

public class Test {
    public static void main(String[] args) {
        Man man = new Man("oleg", "Ivanov", 180, 80);
        System.out.println( man.getFirstName());
        Man man2 = new Man("Alex", "Lee", 190, 85);
        Woman woman = new Woman("Elena", "Ivanova", 160, 55);
        Woman woman2 = new Woman("Sara", "Mikov", 140, 60);
        System.out.println(woman.toString());
        HumanService.compatibilityTest(man, woman);
        HumanService.compatibilityTest(man2, woman);
        HumanService.compatibilityTest(man, woman2);
        HumanService.compatibilityTest(woman2, man2);
        HumanService.compatibilityTest(man, man2);
    }
}