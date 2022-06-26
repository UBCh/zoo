package animals;

public class Dog extends Animal{

    protected String breed;
    public Dog(String food, String location, String sounds, String bread) {
        super(food, location, sounds);
        this.breed=bread;
    }



    @Override
    public void makeNoise() {
        System.out.println( "Dog " + breed+ " make Noise ");
    }

    @Override
    public void eat() {
        System.out.println( "Dog eat "+ food);
    }

    @Override
    public void sleep() {
        System.out.println( "Dog sleep"+ location);
    }


    public void animalHas() {

        System.out.println( "dog breed "+ breed);
    }


}
