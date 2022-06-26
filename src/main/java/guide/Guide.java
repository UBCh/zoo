package guide;

import animals.Cat;
import animals.Dog;
import animals.Horse;

public class Guide {

    static Horse horse=new Horse("hay ", "stable", "neighing", "long red mane");
    static Dog dog=new Dog("bone", "under the porch", "barks loudly", "mongrel");
    static Cat cat=new Cat("cream", "in the chair", "purring", "sharp claws");


    public static void main(String[] args) {
        horse.makeNoise();
        horse.eat();
        horse.sleep();
        horse.animalHas();

        dog.makeNoise();
        dog.eat();
        dog.sleep();
        dog.animalHas();

       cat.makeNoise();
        cat.eat();
        cat.sleep();
        cat.animalHas();

    }




}
