import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entites.Department;
import model.entites.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDAO sellerdao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1 seller findById ===");
        Seller seller = sellerdao.findById(3);
        System.out.println(seller);

        System.out.println("=== TEST 2 seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerdao.findByDepartment(department);

        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 3 seller findAll ===");
        list = sellerdao.findAll();

        for(Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 4 seller insert ===");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerdao.insert(newSeller);
        System.out.println("Inserted! New Id = " + newSeller.getId());

        System.out.println("=== TEST 5 seller update ===");
        seller = sellerdao.findById(1);
        seller.setName("Rafael Rocha");
        sellerdao.update(seller);
        System.out.println("Update completed");
    }
}