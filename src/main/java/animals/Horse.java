package animals;

public class Horse extends Animal {

    protected String mane;

    public Horse(String food, String location, String sounds, String mane) {
        super(food, location, sounds);
        this.mane = mane;
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

        System.out.println("Animal has " + mane);
    }


}
