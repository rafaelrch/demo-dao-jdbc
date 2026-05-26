import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entites.Department;
import model.entites.Seller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        DepartmentDAO departmentdao = DaoFactory.createDepartmentDao();

        List<Department> list = new ArrayList<>();

        System.out.println("=== TEST 1 department findAll ===");
        list = departmentdao.findAll();

        for(Department obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 2 department findById ===");
        System.out.println("Enter Id for filter department:");
        Department department = departmentdao.findById(sc.nextInt());
        System.out.println(department);

        sc.close();
    }
}