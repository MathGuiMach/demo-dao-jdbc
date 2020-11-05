package model.dao;

import db.DB;

public class DaoFactory {
	
	public static Dao createSellerDaoJdbc() {
		return new SellerDaoJdbc(DB.getConnection());
	}
	
}
