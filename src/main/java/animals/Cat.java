package animals;

public class Cat extends Animal {

    protected String claw;

    public Cat(String food, String location, String sounds, String claw) {
        super(food, location, sounds);
        this.claw = claw;
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

        System.out.println("Animal has " + claw);
    }

}
