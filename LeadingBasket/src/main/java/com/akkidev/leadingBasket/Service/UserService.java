package com.akkidev.leadingBasket.Service;

import java.util.List;

import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;

public interface UserService {

	public void addUser(user_master user);

	public List<user_master> getUser();

	public user_master findById(int id);

	public user_master update(user_master user);

	public void delete(int id);

	public state_master getStateById(int id);

	public List<state_master> getState();

	public city_master getCityById(int id);

	public List<city_master> getCities();
}
