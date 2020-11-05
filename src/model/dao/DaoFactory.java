package model.dao;

public class DaoFactory {
	
	public static Dao createSellerDaoJdbc() {
		return new SellerDaoJdbc();
	}
}
