package Day13;
import java.util.Scanner;
class Product{
    private String name;
    private double price;

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    String getname(){
        return name;
    }

    double getprice(){
        return price;
    }

    void setprice(double newPrice){
        if(newPrice > 0){
            price = newPrice;
        }else{
            System.out.println("Price cannot be negative or zero.");
        }
    }
}
public class ClassExercise_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String productName = sc.nextLine();
        double productPrice = sc.nextDouble();
        double newPrice = sc.nextDouble();

        Product p = new Product(productName, productPrice);

        System.out.println("Product: " + p.getname());
        System.out.println("Initial Price: " + p.getprice());
        p.setprice(newPrice);
        System.out.println("Updated Price: " + p.getprice());
    }
}
