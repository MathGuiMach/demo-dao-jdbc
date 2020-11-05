package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DaoSeller;
import model.entities.Department;
import model.entities.Seller;

public class SellerDaoJdbc implements DaoSeller{

	private Connection conn;
	
	public SellerDaoJdbc(Connection conn) {
		this.conn = conn;
	}

	@Override
	public Seller findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try	 {
			st = conn.prepareStatement("Select Seller.*,department.name as DepName from Seller "
					+ "inner join Department on Seller.DepartmentId = Department.Id where Seller.id = ?");
			st.setInt(1, id);
			rs = st.executeQuery();
			
			if(rs.next()) {
//				Seller s = new Seller();
//				s.setId(rs.getInt("id"));
//				s.setName(rs.getString("name"));
//				s.setEmail(rs.getString("email"));
//				s.setBaseSalary(rs.getDouble("basesalary"));
//				s.setBirthDate(rs.getDate("BirthDate"));
//				Department d = new Department(rs.getInt("DepartmentId"),rs.getString("DepName"));
//				s.setDepartment(d);
				return instantiateSeller(rs,instantiateDepartment(rs)); 
			}
			return null;
		}
		catch(SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeResultSet(rs);
			DB.closeStatement(st);
		}
	}

	@Override
	public void insert(Seller obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Seller obj, String[] params) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Seller> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private Department instantiateDepartment(ResultSet rs) throws SQLException {
		return new Department(rs.getInt("DepartmentId"),rs.getString("DepName"));
	}
	
	private Seller instantiateSeller(ResultSet rs, Department dep) throws SQLException {
		Seller s = new Seller();
		s.setId(rs.getInt("id"));
		s.setName(rs.getString("name"));
		s.setEmail(rs.getString("email"));
		s.setBaseSalary(rs.getDouble("basesalary"));
		s.setBirthDate(rs.getDate("BirthDate"));
		s.setDepartment(dep);
		return s;
	}
	
}
