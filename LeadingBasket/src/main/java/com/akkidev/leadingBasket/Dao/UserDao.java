package com.akkidev.leadingBasket.Dao;

import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;
import java.util.*;

public interface UserDao {

	public void addUser(String fname,String lname,Long mobile,String email,Date dob,String address,int city_id,int state_id,String gender,String password);
	
	
	public List<user_master> getUser();

	public user_master findById(int id);

	public user_master update(user_master user);
	
	public void delete(int id);

	public state_master getStateById(int id);
	public List<state_master> getState();
	public city_master getCityById(int id);
	public List<city_master> getCities();
	
	public long getUserCount();
}
