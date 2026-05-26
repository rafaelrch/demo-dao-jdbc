import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entites.Department;
import model.entites.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDAO sellerdao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1 findById ===");
        Seller seller = sellerdao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 2 findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerdao.findByDepartment(department);

        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 3 findAll ===");
        list = sellerdao.findAll();

        for(Seller obj : list){
            System.out.println(obj);
        }
    }
}