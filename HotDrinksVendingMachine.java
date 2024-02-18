import java.util.ArrayList;


public class HotDrinksVendingMachine implements VendingMachine{

    private ArrayList<TemperatureHotDrink> products = new ArrayList<>();
    @Override
    public HotDrink getProduct(String name, double volume, int temperature) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getType() == name &&
            products.get(i).getVolume() == volume &&
            products.get(i).getTemperature() == temperature)
                return products.get(i);
        }
        return products.get(0);
    }
    @Override
    public void addProduct(String name, double volume, int temperature) {
        TemperatureHotDrink obj = new TemperatureHotDrink(name, volume, 0, temperature);
        products.add(obj);
    }
    public HotDrinksVendingMachine() {
        addProduct("null", 0, 0);
    }

}
