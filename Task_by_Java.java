class Product{

    String name;
    double price;

    Product(String n, double p){
        name = n;
        price = p;
    }
    String getName(){
        return name;
    }
    double getPrice(){
        return price;
    }
}
import java.util.ArrayList;

class Cart{

    ArrayList<Product> list;

    Cart(){
        list = new ArrayList<Product>();
    }

    void add(Product pr){
        list.add(pr);
    }

    void del(String name){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getName().equals(name)){
                list.remove(i);
                return;
            }
        }
    }
    double sum(){
        double s = 0;
        for (int i = 0; i < list.size(); i++){
            s = s + list.get(i).getPrice();
        }
        return s;
    }

    void show() {
        System.out.println("Ваша корзина:");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getName() + " " + list.get(i).getPrice());
        }
        System.out.println("Сумма выбранных товаров = " + sum());
    }
}

public class Main{
    public static void main(String[] args){

        Product a = new Product("Яблоко", 15);
        Product b = new Product("Банан", 24);
        Product c = new Product("Як", 1500000);
        Cart k = new Cart();
        k.add(a);
        k.add(b);
        k.add(c);
        k.show();
        k.del("Яблоко");
        k.show();
    }
}


