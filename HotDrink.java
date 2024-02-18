/**
 * HotDrink
 */
public class HotDrink {

    protected String type;
    protected double volume;
    protected double weight; 

    public String getType() {
        return type;
    }

    public double getVolume() {
        return volume;
    }

    public double getWeight() {
        return weight;
    }

    HotDrink(String type, double volume, double weight) {
        this.type = type;
        this.volume = volume;
    }


}