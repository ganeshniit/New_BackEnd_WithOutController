package com.aussie.kangaroo.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import com.aussie.kangaroo.model.User;

@EnableTransactionManagement
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionfactory;
		public UserDAOImpl(SessionFactory sessionfactory) {
		super();
		this.sessionfactory = sessionfactory;
	}

	public boolean save(User user) {
		sessionfactory.getCurrentSession().save(user);
		return false;
	}

	public boolean delete(User user) {
		sessionfactory.getCurrentSession().delete(user);
		return false;
	}

	public boolean update(User user) {
		sessionfactory.getCurrentSession().update(user);
		return false;
	}

	public User get(String name) {

		
		String sql="from UserDetails where name="+"'"+name+"'";
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		List<User> list=query.list();
		if(list==null){
			return null;
		}
		else{
			return list.get(0);
			
		}
	}

	public List<User> list() {
		String sql="from User";
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		return query.list();
		
	}

	public User isValidUser(String email, String password) {
		String sql="from User where id='" +email+"' and password='" + password +"'";
		Query query=sessionfactory.getCurrentSession().createQuery(sql);
		List<User> list=query.list();
		
		if(list==null){
			return null;
		}
		else{
			return list.get(0);
			
		}

	}
	

}
