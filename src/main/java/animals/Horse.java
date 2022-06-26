package animals;

public class Horse extends Animal{

    protected String mane;

     public Horse(String food, String location, String sounds, String mane){
        super(food, location, sounds);
        this.mane=mane;
     }


    @Override
    public void makeNoise() {
        System.out.println( "Horse "+ sounds+"  make Noise ");

    }

    @Override
    public void eat() {
        System.out.println( "Horse eat "+ food);
    }

    @Override
    public void sleep() {

        System.out.println( "Horse sleep "+ location);
    }

    public void animalHas() {

        System.out.println( "Horse has "+ mane);
    }


}
