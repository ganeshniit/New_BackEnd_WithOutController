package com.aussie.kangaroo.DAO;

import java.util.List;

import com.aussie.kangaroo.model.User;

public interface UserDAO {
	
	public boolean save(User user);
	public boolean delete(User user);
	public boolean update(User user);
	public User get(String name);
    public List<User> list();
    public User isValidUser(String email,String password);

}
