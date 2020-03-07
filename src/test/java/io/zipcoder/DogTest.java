package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testSpeak(){
        Dog newDog = new Dog("");
        String expected = "Woof! Woof!";
        String actual = newDog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        Dog dog = new Dog("Tommy");
        String expected = "Tommy";
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        Dog dog = new Dog("");
        String expected = "Odie";
        dog.setName("Odie");
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }
}

