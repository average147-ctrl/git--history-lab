public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " — " + price + " руб.";
    }
}

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void removeProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
                break;
            }
        }
    }

    public double getTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void printCart() {
        System.out.println("=== Корзина ===");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }
        System.out.println("Итого: " + getTotal() + " руб.\n");
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем товары
        Product laptop = new Product("Ноутбук", 75000.0);
        Product mouse = new Product("Мышка", 1500.0);
        Product keyboard = new Product("Клавиатура", 3000.0);

        // Создаем корзину
        Cart cart = new Cart();

        // Добавляем товары в корзину
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        // Показываем корзину
        cart.printCart();

        // Удаляем товар
        System.out.println("Удаляем: Мышка");
        cart.removeProduct("Мышка");

        // Снова показываем корзину
        cart.printCart();
    }
}