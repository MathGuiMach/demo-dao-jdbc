package model.dao;

import java.util.List;

public interface DAO<T> {

	T findById(Integer id);
	
	void insert(T obj);
    
    void update(T obj, String[] params);
    
    void deleteById(Integer id);
        
    List<T> findAll();
	
}
