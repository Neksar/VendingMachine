import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> hotDrinks = new ArrayList<>();
        hotDrinks.add(new HotDrink("Чай", 200, 1.0, 80));
        hotDrinks.add(new HotDrink("Кофе", 200, 1.5, 90));
        
        VendingMachine hotDrinkVendingMachine = new HotDrinkVendingMachine();
        hotDrinkVendingMachine.initProducts(hotDrinks);
        
        System.out.println("Доступны горячие напитки:");
        for (Product product : hotDrinks) {
            System.out.println(product);
        }
        
        System.out.println("\nПокупка чашки чая, температура - 80С:");
        Product boughtHotDrink = ((HotDrinkVendingMachine) hotDrinkVendingMachine).getProduct("Чай", 100, 80);
        if (boughtHotDrink != null) {
            System.out.println("Вы купили: " + boughtHotDrink);
        } else {
            System.out.println("Извините, напиток недоступен!");
        }
        
        System.out.println("\nПокупка чашки кофе, температура - 85С:");
        boughtHotDrink = ((HotDrinkVendingMachine) hotDrinkVendingMachine).getProduct("Кофе", 100, 90);
        if (boughtHotDrink != null) {
            System.out.println("Вы купили: " + boughtHotDrink);
        } else {
            System.out.println("Извините, напиток недоступен!");
        }
    }
}