package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Seller findById ====");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: Seller findAll ====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		//System.out.println("\n=== TEST 3: Seller insert ====");
		//Department newDep = new Department(null, "XPTO");
		//departmentDao.insert(newDep);
		//*System.out.println("Inserted! new Department = " + newDep.getId());
				
		System.out.println("\n=== TEST 4: Seller update ====");
		department = departmentDao.findById(9);
		department.setName("Women's Fashion");
		departmentDao.update(department);
		System.out.println("Update completed");
				
		System.out.println("\n=== TEST 5: Seller delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.delete(id);
		System.out.println("Delete completed!");
				
		sc.close();

	}

}
