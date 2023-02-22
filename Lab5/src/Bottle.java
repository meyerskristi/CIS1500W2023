public class Bottle {

    private int maxVolumeInMilliliters;

    private int currentVolumeInMilliliters;

    private String beverageName;

    public Bottle() {
        beverageName = "";
        currentVolumeInMilliliters = 0;
        maxVolumeInMilliliters = 0;
    }

    public Bottle(int maxVolumeInMilliliters, int currentVolumeInMilliliters, String beverageName) {
        this.maxVolumeInMilliliters = maxVolumeInMilliliters;
        this.currentVolumeInMilliliters = currentVolumeInMilliliters;
        this.beverageName = beverageName;
    }

    public boolean drink(int millilitersToDrink ){
        if ( millilitersToDrink > currentVolumeInMilliliters){
            return false;
        }
        currentVolumeInMilliliters -= millilitersToDrink;
        return true;
    }

    public boolean fill(int millilitersToFill){
        if ( currentVolumeInMilliliters + millilitersToFill > maxVolumeInMilliliters){
            return false;
        }
        currentVolumeInMilliliters += millilitersToFill;
        return true;
    }

    public int getMaxVolumeInMilliliters() {
        return maxVolumeInMilliliters;
    }

    public void setMaxVolumeInMilliliters(int maxVolumeInMilliliters) {
        this.maxVolumeInMilliliters = maxVolumeInMilliliters;
    }

    public int getCurrentVolumeInMilliliters() {
        return currentVolumeInMilliliters;
    }


    public String getBeverageName() {
        return beverageName;
    }

    public void setBeverageName(String beverageName) {
        this.beverageName = beverageName;
    }
}
