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

        System.out.println("=== TEST 3 department insert ===");
        System.out.println("Enter name for department: ");
        String name = sc.next();
        Department dep = new Department(null, name);
        departmentdao.insert(dep);
        System.out.println("Inserted! New Id = " + dep.getId());

        System.out.println("=== TEST 4 department delete ===");
        System.out.println("Enter Id for delete department: ");
        departmentdao.deleteById(sc.nextInt());
        System.out.println("Delete completed");

        sc.close();
    }
}