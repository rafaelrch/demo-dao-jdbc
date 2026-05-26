import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entites.Department;
import model.entites.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SellerDAO sellerdao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1 findById ===");
        Seller seller = sellerdao.findById(3);

        System.out.println(seller);

    }
}