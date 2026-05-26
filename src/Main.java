import model.entites.Department;
import model.entites.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department dpt = new Department(1, "books");
        Seller seller = new Seller(2, "Rafael", "rafael@gmail.com", new Date(), 3000.0, dpt );
        System.out.println(seller);
        System.out.println(dpt);
    }
}