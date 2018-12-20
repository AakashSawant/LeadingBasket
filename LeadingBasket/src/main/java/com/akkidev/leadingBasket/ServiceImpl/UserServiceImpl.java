package com.akkidev.leadingBasket.ServiceImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akkidev.leadingBasket.Dao.UserDao;
import com.akkidev.leadingBasket.Service.UserService;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public void addUser(user_master user) {
		userDao.addUser(user);
		
	}

	@Override
	public List<user_master> getUser() {
		// TODO Auto-generated method stub
		return userDao.getUser();
	}

	@Override
	public user_master findById(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id);
	}

	@Override
	public user_master update(user_master user) {
		// TODO Auto-generated method stub
		return userDao.update(user);
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
		// TODO Auto-generated method stub
		return userDao.getState();
	}

	@Override
	public city_master getCityById(int id) {
		// TODO Auto-generated method stub
		return userDao.getCityById(id);
	}

	@Override
	public List<city_master> getCities() {
		// TODO Auto-generated method stub
		return userDao.getCities();
	}
	
	
}
