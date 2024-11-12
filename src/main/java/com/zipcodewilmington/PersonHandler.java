package com.zipcodewilmington;

import java.util.Arrays;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        int counter = 0;
        while (counter < personArray.length) {
            result += personArray[counter];
            counter++;
        }
        return result;
        }



    public String forLoop() {
        String result = "";
        for (int i = 0; i<personArray.length; i++) {
            Person currentPerson = personArray[i];
            result += String.valueOf(currentPerson);
        }
        return result;
    }



    public String forEachLoop() {
        String result = "";
        for (Person person : personArray){
            result += String.valueOf(person);
        }
        return result;
    }

}
