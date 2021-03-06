package com.akkidev.leadingBasket.ServiceImpl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.UserActivity;
import com.akkidev.leadingBasket.Dao.UserDao;
import com.akkidev.leadingBasket.Service.UserService;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserActivity userActivity ;

	
	@Override
	public List<user_master> getUser() {
	
		return userActivity.getUser();
	}

	@Override
	public user_master findById(int id) {
		// TODO Auto-generated method stub
		return userActivity.findById(id);
	}

	

	@Override
	public void delete(int id) {
		userActivity.delete(id);
		
	}

	@Override
	public state_master getStateById(int id) {
		// TODO Auto-generated method stub
		return userActivity.getStateById(id);
	}

	@Override
	public List<state_master> getState() {
		// TODO Auto-generated method stub
		return userActivity.getState();
	}

	@Override
	public city_master getCityById(int id) {
	
		return userActivity.getCityById(id);
	}

	@Override
	public List<city_master> getCities() {
		// TODO Auto-generated method stub
		return userActivity.getCities();
	}

	@Override
	public long getUserCount() {
		
		return userActivity.getUserCount();
	}

	@Override
	public user_master addUser(String fname, String lname, Long mobile, String email, Date dob, String address,
			int city_id, int state_id, String gender, String password) {
		
		return userActivity.addUser(fname,lname,mobile,email,dob,address,city_id,state_id,gender,password);
		
	}

	@Override
	public user_master findUserByEmailAndPassword(String em, String pass) {
		return userActivity.findUserByEmailAndPassword(em, pass);
		
	}

	@Override
	public user_master updateUser(int id,String fname, String lname, Long mobile, String email, String address, int city_id,
			int state_id, String password) {
	
		return userActivity.updateUser(id,fname, lname, mobile, email, address, city_id, state_id, password);
	}

	@Override
	public boolean checkloginuser(String email, String pass) {
		
		return userActivity.checkloginuser(email, pass);
	}
	
}
