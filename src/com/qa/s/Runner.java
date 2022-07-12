package com.qa.s;

public class Runner {


    public static void main(String[] args) {
        
        Driver driver = new Driver("Red", "v8", 21333);

        System.out.println(driver);

        driver.drive(132333);

        System.out.println(driver);

        Mechanic mechanic = new Mechanic("Red", "V8", 123333, true, true, false);

        System.out.println(mechanic);

    }
    
}
