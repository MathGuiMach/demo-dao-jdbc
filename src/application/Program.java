package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DaoSeller;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DaoSeller sellerDao = DaoFactory.createSellerDaoJdbc();
		
		Seller s = sellerDao.findById(1);
		System.out.println(s.toString()); 
		
		List<Seller> selss = sellerDao.findByDepartmentId(new Department(2,null));
		for(Seller ss : selss) {
			System.out.println(ss);
		}
		
		List<Seller> selss2 = sellerDao.findAll();
		for(Seller ss : selss2) {
			System.out.println(ss);
		}
		
	}

}
