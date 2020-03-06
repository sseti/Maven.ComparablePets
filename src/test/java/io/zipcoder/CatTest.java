package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testSpeak(){

        Cat newCat = new Cat();
        String expected = "Meow! Meow!";
        String actual = newCat.speak();
        Assert.assertEquals(expected, actual);
    }
}

