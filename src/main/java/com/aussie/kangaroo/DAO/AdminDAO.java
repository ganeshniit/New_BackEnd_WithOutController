package com.aussie.kangaroo.DAO;



import com.aussie.kangaroo.model.Admin;

public interface AdminDAO {
	

	public boolean save(Admin admin);
	public boolean delete(Admin admin);
	public boolean update(Admin admin);
	public Admin get(String email);
    public Admin isValidAdmin(String email,String password);


}
