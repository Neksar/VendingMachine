import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {
    private List<Product> products = new ArrayList<>();
    
    @Override
    public void initProducts(List<Product> products) {
        this.products.addAll(products);
    }
    
    @Override
    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);
                return product;
            }
        }
        return null;
    }
    
    public Product getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product.getName().equals(name) && ((HotDrink) product).getTemperature() == temperature) {
                products.remove(product);
                return product;
            }
        }
        return null;
    }
}