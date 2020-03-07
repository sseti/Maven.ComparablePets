package io.zipcoder;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" How many pets do you have (1-3)?");
        int number = sc.nextInt();
        sc.nextLine();
        List<Pet> pets = new ArrayList<Pet>();
        for (int i = 0; i < number; i++) {

            System.out.println(" What kind of pet do you have (Dog/Cat/Parrot)?");
            String variety = sc.nextLine().toUpperCase();

            System.out.println(" What is pet name?");
            String name = sc.nextLine();

            if (variety.equals("CAT")) {
                Pet cat = new Cat("");
                cat.setName(name);
                pets.add(cat);

            } else if (variety.equals("DOG")) {
                Pet dog = new Dog("");
                dog.setName(name);
                pets.add(dog);

            } else if (variety.equals("PARROT")) {
                Pet rabbit = new Parrot("");
                rabbit.setName(name);
                pets.add(rabbit);
            }
        }
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " Says : " + pet.speak());
        }
    }
}







