package animals;

public class Cat extends Animal{

    protected String claw;

    public Cat(String food, String location, String sounds, String claw) {
        super(food, location, sounds);
        this.claw= claw;
    }

    @Override
    public void makeNoise() {
        System.out.println( "Cat " + sounds+ " make Noise ");
    }

    @Override
    public void eat() {
        System.out.println( "Cat eat "+ food);
    }

    @Override
    public void sleep() {
        System.out.println( "Cat sleep"+ location);
    }

    public void animalHas() {

        System.out.println( "Cat has "+ claw);
    }

}
