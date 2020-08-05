package application;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
	
		Department obj = new Department(1, "Bazar");
		
		Seller seller = new Seller(1, "James Omero", "jamesomer@gmail.com", new Date(), 2500.0, obj);
		
		System.out.println(seller);

	}

}
