package com.akkidev.leadingBasket.repositoryImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akkidev.leadingBasket.Dao.UserDao;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;
import com.akkidev.leadingBasket.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	UserDao userDao;
	
	@Override
	public user_master addUser(String fname,String lname,Long mobile,String email,Date dob,String address,int city_id,int state_id,String gender,String password) {
		return userDao.addUser(fname,lname,mobile,email,dob,address,city_id,state_id,gender,password);
		
	}

	@Override
	public List<user_master> getUser() {
		
		return userDao.getUser();
	}

	@Override
	public user_master findById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	

	@Override
	public void delete(int id) {
		userDao.delete(id);
		
	}

	@Override
	public state_master getStateById(int id) {
		// TODO Auto-generated method stub
		return userDao.getStateById(id);
	}

	@Override
	public List<state_master> getState() {
		
		return userDao.getState();
	}

	@Override
	public city_master getCityById(int id) {
		// TODO Auto-generated method stub
		return userDao.getCityById(id);
	}

	@Override
	public List<city_master> getCities() {
		
		return userDao.getCities();
	}

	@Override
	public long getUserCount() {
		// TODO Auto-generated method stub
		return userDao.getUserCount();
	}

	@Override
	public user_master findUserByEmailAndPassword(String em, String pass) {
		// TODO Auto-generated method stub
		return userDao.findUserByEmailAndPassword(em, pass);
	}

	@Override
	public user_master updateUser(int id,String fname, String lname, Long mobile, String email, String address, int city_id,
			int state_id, String password) {
		return userDao.updateUser(id,fname, lname, mobile, email, address, city_id, state_id, password);
		
	}

	@Override
	public boolean checkloginuser(String email, String pass) {
		
		return userDao.checkloginuser(email, pass);
	}

	
}
