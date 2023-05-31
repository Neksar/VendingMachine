public class HotDrink extends Product {
    private int temperature;
    
    public HotDrink(String name, int volume, double price, int temperature) {
        super(name, volume, price);
        this.temperature = temperature;
    }
    
    public int getTemperature() {
        return temperature;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    
    @Override
    public String toString() {
        return "Напиток: " + getName() + ", температура напитка: " + temperature + ", стоимость: " + getPrice();
    }
}