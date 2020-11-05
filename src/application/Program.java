package application;

import model.dao.Dao;
import model.dao.DaoFactory;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Dao sellerDao = DaoFactory.createSellerDaoJdbc();
		
		Seller s = (Seller) sellerDao.findById(1);
		System.out.println(s.toString()); 
		
	}

}
