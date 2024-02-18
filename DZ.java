/**
 * DZ
 */
public class DZ {

    public static void main(String[] args) {
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine();
        hotDrinksVendingMachine.addProduct("горячий_шоколад", 0.25, 90);
        hotDrinksVendingMachine.addProduct("чай", 0.25, 90);
        hotDrinksVendingMachine.addProduct("горячий_лимонад", 0.25, 70);

        System.out.println(hotDrinksVendingMachine.getProduct("кофе", 0.5, 80).toString());
        System.out.println(hotDrinksVendingMachine.getProduct("чай", 0.25, 90).toString());
        System.out.println(hotDrinksVendingMachine.getProduct("горячий_шоколад", 0.25, 90).toString());
    }
}