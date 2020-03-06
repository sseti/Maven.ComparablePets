package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTest {

    @Test
    public void TestC(){
        Cat Athos = new Cat();
        Dog Porthos = new Dog();
        Parrot Aramis = new Parrot();
        ArrayList<Pet> myPets = new ArrayList();
        myPets.add(Athos);
        myPets.add(Porthos);
        myPets.add(Aramis);
        Collections.sort(myPets);
        System.out.println(Arrays.toString(myPets.toArray()));
        for(Pet a : myPets){
            System.out.println(a.getClass());
        }
    }
}
