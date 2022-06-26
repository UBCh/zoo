package animals;

public class Animal {
    protected String food;
    protected String location;
    protected String sounds;

    public Animal(String food, String location, String sounds) {
        this.food = food;
        this.location = location;
        this.sounds = sounds;
    }

    protected void makeNoise (){
     System.out.println( "Animal " + sounds+ "make Noise ");

    }

    protected void eat (){

        System.out.println( "Animal eat "+food );
    }

    protected void sleep (){

        System.out.println( "Animal sleep "+ location);
    }
}
