package animals;

public class Dog extends Animal {

    protected String breed;

    public Dog(String food, String location, String sounds, String bread) {
        super(food, location, sounds);
        this.breed = bread;
    }


    @Override
    public void makeNoise() {
        super.makeNoise( );
    }

    @Override
    public void eat() {
        super.eat( );
    }

    @Override
    public void sleep() {
        super.sleep( );
    }


    public void animalHas() {

        System.out.println("Animal breed " + breed);
    }


}
