package application;

import model.dao.Dao;
import model.dao.DaoFactory;
import model.dao.DaoSeller;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DaoSeller sellerDao = DaoFactory.createSellerDaoJdbc();
		
		Seller s = sellerDao.findById(1);
		System.out.println(s.toString()); 
		
	}

}
