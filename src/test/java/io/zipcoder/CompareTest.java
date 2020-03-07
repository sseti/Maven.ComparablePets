package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CompareTest {

    @Test
    public void compare() {
        Compare petTypeComparator = new Compare();
        Pet pet = new Pet();
        pet.setName("dog");
        Pet pet1 = new Pet();
        pet1.setName("dog");
        int actual = petTypeComparator.compare(pet,pet1);
        Assert.assertEquals(0,actual);
    }
}
