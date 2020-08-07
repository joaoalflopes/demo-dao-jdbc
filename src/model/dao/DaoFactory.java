package model.dao;

import model.dao.impl.SellerDaoJDBC;
import model.database.DB_conector;

public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB_conector.getConnection());
	}
}
