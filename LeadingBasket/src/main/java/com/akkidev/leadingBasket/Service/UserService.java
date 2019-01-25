package com.akkidev.leadingBasket.Service;

import java.util.Date;
import java.util.List;

import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;

public interface UserService {

	public user_master addUser(String fname,String lname,Long mobile,String email,Date dob,String address,int city_id,int state_id,String gender,String password);

	public List<user_master> getUser();
	public boolean checkloginuser(String email,String pass);
	public user_master findUserByEmailAndPassword(String em,String pass);

	public user_master findById(int id);

	public user_master updateUser(int id,String fname,String lname,Long mobile,String email,String address,int city_id,int state_id,String password);

	public void delete(int id);

	public state_master getStateById(int id);

	public List<state_master> getState();

	public city_master getCityById(int id);

	public List<city_master> getCities();
	
	public long getUserCount();
}
