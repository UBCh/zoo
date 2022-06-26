package guide;

import animals.Cat;
import animals.Dog;
import animals.Horse;

public class Guide {

    static Horse horse = new Horse("hay ", "stable", "neighing", "long red mane");
    static Dog dog = new Dog("bone", "under the porch", "barks loudly", "mongrel");
    static Cat cat = new Cat("cream", "in the chair", "purring", "sharp claws");


    public static void main(String[] args) {
        horse.makeNoise( );
        horse.eat( );
        horse.sleep( );
        horse.animalHas( );
        System.out.println("this animal is a HORSE");
        System.out.println("======================================================================");
        dog.makeNoise( );
        dog.eat( );
        dog.sleep( );
        dog.animalHas( );
        System.out.println("this animal is a DOG");
        System.out.println("======================================================================");
        cat.makeNoise( );
        cat.eat( );
        cat.sleep( );
        cat.animalHas( );
        System.out.println("this animal is a CAT");
        System.out.println("======================================================================");
    }


}
