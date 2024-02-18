/**
 * TemperatureHotDrink
 */
public class TemperatureHotDrink extends HotDrink {

    private int temperature;

    int getTemperature() {
        return temperature;
    }

    TemperatureHotDrink(String type, double volume, double weight, int temperature) {
        super(type, volume, weight);
        if (temperature > 0 && temperature < 100) this.temperature = temperature;
        else this.temperature = 99;
    }

    @Override
    public String toString() {
        if (this.type == "null") return "null";
        StringBuilder str = new StringBuilder();
        str.append("name=");
        str.append(this.type);
        str.append(" volume=");
        str.append(this.volume);
        str.append(" temperature=");
        str.append(this.temperature);
        return str.toString();
    }
}