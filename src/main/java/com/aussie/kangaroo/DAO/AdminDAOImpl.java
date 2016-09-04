package com.aussie.kangaroo.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.aussie.kangaroo.model.Admin;
@Repository
@EnableTransactionManagement
public class AdminDAOImpl implements AdminDAO {
	@Autowired
	private SessionFactory sessionfactory;
	
	
	
	
	public AdminDAOImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	public boolean save(Admin admin) {
		sessionfactory.getCurrentSession().save(admin);
		return false;
	}

	public boolean delete(Admin admin) {
		sessionfactory.getCurrentSession().delete(admin);
		return false;
	}

	public boolean update(Admin admin) {
		sessionfactory.getCurrentSession().update(admin);
		return false;
	}

	public Admin get(String email) {
		String sql="from Admin where email="+"'"+email+"'";
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		List<Admin> list=query.list();
		if(list==null){
			return null;
		}
		else{
			return list.get(0);
			
		}

	}

	public Admin isValidAdmin(String email, String password) {
		String sql="from Admin where id='" +email+"' and password='" + password +"'";
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		List<Admin> list=query.list();
		
		if(list==null){
			return null;
		}
		else{
			return list.get(0);
			
		}
	}

	
}
