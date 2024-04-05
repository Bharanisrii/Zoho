package assignment7;

 public class Product {

    
    private String name;
    private double price;
    private int quantity;
    private char initial;
    private boolean inStock;

 public Product(String name, double price, int quantity, char initial, boolean inStock) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.initial = initial;
        this.inStock = inStock;
    }

    public void printDetails() {
        System.out.println("Product Details:");
        System.out.println("   Name: " + name);
        System.out.println("   Price: $" + price); // Use String.format for currency formatting
        System.out.println("   Quantity: " + quantity);
        System.out.println("   Initial: " + initial);
        System.out.println("   In Stock: " + inStock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 799.99, 10, 'L', true);
        product1.printDetails();
    }
}
