import java.util.ArrayList;
import java.util.List;

// --- Product Class ---
class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name + " x " + quantity + " @ ₹" + price + " = ₹" + getTotalPrice();
    }
}

// --- Bill Class ---
class Bill {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getTotalPrice();
        }
        return total;
    }

    public void printBill() {
        System.out.println("------ BILL ------");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("------------------");
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}

// --- Main Class ---
public class BillingSystem {
    public static void main(String[] args) {
        Bill bill = new Bill();

        // Adding products
        bill.addProduct(new Product("Pen", 10, 2));
        bill.addProduct(new Product("Notebook", 50, 3));
        bill.addProduct(new Product("Eraser", 5, 5));

        // Print bill
        bill.printBill();
    }
}
