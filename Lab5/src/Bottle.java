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
        setMaxVolumeInMilliliters(maxVolumeInMilliliters);
        this.currentVolumeInMilliliters = 0;
        fill(currentVolumeInMilliliters);
        setBeverageName(beverageName);
    }

    public boolean drink(int millilitersToDrink ){
        if ( millilitersToDrink > currentVolumeInMilliliters
                || millilitersToDrink < 0 ){
            return false;
        }
        currentVolumeInMilliliters -= millilitersToDrink;
        return true;
    }

    public boolean fill(int millilitersToFill){
        if ( currentVolumeInMilliliters + millilitersToFill > maxVolumeInMilliliters
                || millilitersToFill < 0 ){
            return false;
        }
        currentVolumeInMilliliters += millilitersToFill;
        return true;
    }

    public int getMaxVolumeInMilliliters() {
        return maxVolumeInMilliliters;
    }

    public void setMaxVolumeInMilliliters(int maxVolumeInMilliliters) {
        if ( maxVolumeInMilliliters > 0 ) {
            this.maxVolumeInMilliliters = maxVolumeInMilliliters;
        }
        else {
            this.maxVolumeInMilliliters = 0;
        }
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
