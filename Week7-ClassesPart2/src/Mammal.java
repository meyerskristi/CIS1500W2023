public class Mammal {
    private String noise;
    private String hairColor;
    private String name;

    public Mammal() {
        noise = "";
        hairColor = "";
        name = "";
    }

    public Mammal(String noise, String hairColor, String name) {
        this.noise = noise;
        this.hairColor = hairColor;
        this.name = name;
    }

    public String makeNoise(){
        return name + " makes a " + noise + " sound";
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
