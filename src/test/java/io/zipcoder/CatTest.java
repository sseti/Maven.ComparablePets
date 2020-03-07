package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testSpeak(){

        Cat newCat = new Cat("");
        String expected = "Meow! Meow!";
        String actual = newCat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        Cat cat = new Cat("Princess");
        String expected = "Princess";
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest(){
        Cat cat = new Cat("");
        String expected = "Tom";
        cat.setName("Tom");
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
    }

}

