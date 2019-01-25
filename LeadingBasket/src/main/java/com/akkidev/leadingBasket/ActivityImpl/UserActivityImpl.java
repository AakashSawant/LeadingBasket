package com.akkidev.leadingBasket.ActivityImpl;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Activity.UserActivity;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;
import com.akkidev.leadingBasket.repository.UserRepository;

@Service
@Transactional
public class UserActivityImpl implements UserActivity {

	@Autowired
	UserRepository userRepo;
	
	
	@Override
	public user_master addUser(String fname,String lname,Long mobile,String email,Date dob,String address,int city_id,int state_id,String gender,String password) {
		
		return userRepo.addUser(fname,lname,mobile,email,dob,address,city_id,state_id,gender,password);
			
	}

	@Override
	public List<user_master> getUser() {
		
		return userRepo.getUser();
	}

	@Override
	public user_master findById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	

	@Override
	public void delete(int id) {
		userRepo.delete(id);
		
	}

	@Override
	public state_master getStateById(int id) {
		return userRepo.getStateById(id);
		
	}

	@Override
	public List<state_master> getState() {
		
		return userRepo.getState();
	}

	@Override
	public city_master getCityById(int id) {
		// TODO Auto-generated method stub
		return userRepo.getCityById(id);
	}

	@Override
	public List<city_master> getCities() {
		// TODO Auto-generated method stub
		return userRepo.getCities();
	}

	@Override
	public long getUserCount() {
		// TODO Auto-generated method stub
		return userRepo.getUserCount();
	}

	@Override
	public user_master findUserByEmailAndPassword(String em, String pass) {
		// TODO Auto-generated method stub
		return userRepo.findUserByEmailAndPassword(em, pass);
	}

	@Override
	public user_master updateUser(int id,String fname, String lname, Long mobile, String email, String address, int city_id,
			int state_id, String password) {
		// TODO Auto-generated method stub
		return userRepo.updateUser(id,fname, lname, mobile, email, address, city_id, state_id, password);
	}

	@Override
	public boolean checkloginuser(String email, String pass) {
		// TODO Auto-generated method stub
		return userRepo.checkloginuser(email, pass);
	}

}
