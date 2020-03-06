package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class ParrotTest {

    @Test
    public void testSpeak(){
        Parrot newParrot = new Parrot();
        String expected = "Squawk! Squawk!";
        String actual = newParrot.speak();
        Assert.assertEquals(expected, actual);
    }
}

