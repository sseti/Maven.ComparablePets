package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void testSpeak(){
        Dog newDog = new Dog();
        String expected = "Woof! Woof!";
        String actual = newDog.speak();
        Assert.assertEquals(expected, actual);
    }
}

