public class Dog extends Mammal {
    private int jumpHeightInCentimeters;
    private String breed;

    public Dog() {
        // implicitly runs super()
        jumpHeightInCentimeters = 0;
        breed = "";
    }

    public Dog(String noise, String hairColor, String name, int jumpHeightInCentimeters, String breed) {
        // calls the constructor in Mammal
        // must be the first line in a constructor
        super(noise, hairColor, "dog");
        this.jumpHeightInCentimeters = jumpHeightInCentimeters;
        this.breed = breed;
    }

    // annotation so the compiler checks that we actually did override a method
    @Override
    public String makeNoise(){
        return super.makeNoise() + " and jumps " + jumpHeightInCentimeters + " centimeters and knocks you over";
    }

    public int getJumpHeightInCentimeters() {
        return jumpHeightInCentimeters;
    }

    public void setJumpHeightInCentimeters(int jumpHeightInCentimeters) {
        this.jumpHeightInCentimeters = jumpHeightInCentimeters;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
