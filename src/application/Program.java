package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DaoSeller;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		DaoSeller sellerDao = DaoFactory.createSellerDaoJdbc();
		
		Seller s = sellerDao.findById(9);
		System.out.println(s.toString()); 
		
//		sellerDao.deleteById(9);
//		s.setName("Fucking Bitch");
//		sellerDao.update(s);
//		System.out.println(s.toString());
//		
//		List<Seller> selss = sellerDao.findByDepartmentId(new Department(2,null));
//		for(Seller ss : selss) {
//			System.out.println(ss);
//		}
//		
//		List<Seller> selss2 = sellerDao.findAll();
//		for(Seller ss : selss2) {
//			System.out.println(ss);
//		}
		
//		Seller s = new Seller(null,"Mathew","mathguimach@gmail.com",new Date(), 3000.0, new Department(2,null));
//		sellerDao.insert(s);
//		System.out.println(s.toString());
		
		
	}

}
