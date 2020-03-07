package io.zipcoder;

import java.util.Comparator;

public class Pet {

    String name;

    public Pet(){ }

    public Pet(String name){ this.name = name; }

    public void setName(String name){ this.name = name; }

    public String getName(){ return this.name; }

    public String speak(){ return ""; }
}
