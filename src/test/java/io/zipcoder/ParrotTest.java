package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {

    @Test
    public void testSpeak(){
        Parrot newParrot = new Parrot("");
        String expected = "Squawk! Squawk!";
        String actual = newParrot.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        Parrot parrot = new Parrot("Candy");
        String expected = "Candy";
        String actual = parrot.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        Parrot parrot = new Parrot("");
        String expected = "Toff";
        parrot.setName("Toff");
        String actual = parrot.getName();
        Assert.assertEquals(expected,actual);
    }
}

