public interface VendingMachine {
    HotDrink getProduct(String name, double volume, int temperature);
    void addProduct(String name, double volume, int temperature);
} 
