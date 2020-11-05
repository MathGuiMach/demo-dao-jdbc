package application;

import java.util.Date;

public class Program {

	public static void main(String[] args) {
		
		Department dep = new Department(1, "Brabos");
		System.out.println(dep.toString());
		
		Seller sel = new Seller(1,"Brabo","email", new Date(), 3000.0, dep);
		System.out.println(sel.toString());
	}

}
