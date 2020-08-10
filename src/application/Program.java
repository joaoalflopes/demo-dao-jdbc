package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in); 
				
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: Seller findById ====");
		Seller seller = sellerDao.findById(4);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: Seller findByDepartment ====");
		Department department = new Department(3, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Seller findByDepartment ====");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		//System.out.println("\n=== TEST 4: Seller insert ====");
		//Seller newSeller = new Seller(null, "Pedro Costella", "pedro.costella@outlook.com", new java.sql.Date(sdf.parse("31/08/1994").getTime()), 4100.0, department);
		//sellerDao.insert(newSeller);
		//*System.out.println("Inserted! new Seller = " + newSeller.getId());
		
		//System.out.println("\n=== TEST 5: Seller update ====");
		//seller = sellerDao.findById(9);
		//seller.setBirthDate(new java.sql.Date(sdf.parse("29/10/1995").getTime()));
		//sellerDao.update(seller);
		//*System.out.println("Update completed");
		
		System.out.println("\n=== TEST 6: Seller delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

	

}
