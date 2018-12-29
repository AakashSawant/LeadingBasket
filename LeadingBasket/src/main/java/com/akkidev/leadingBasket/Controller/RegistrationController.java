package com.akkidev.leadingBasket.Controller;

import java.util.Collection;
import java.util.Date;
import java.util.Map;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.UserService;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;

@Controller
@RequestMapping(value= {"/user"})
public class RegistrationController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<user_master> getUserById(@PathVariable("id") int id) {
		System.out.println("Fetching User with id " + id);
		user_master user = userService.findById(id);
		if (user == null) {
			return new ResponseEntity<user_master>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<user_master>(user, HttpStatus.OK);

	}

	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public ModelAndView registration(ModelAndView modelAndView, user_master user) throws Exception {
		modelAndView.addObject("user", user);
		modelAndView.addObject("city", userService.getCities());
		modelAndView.addObject("state", userService.getState());
		modelAndView.setViewName("registration");	
		return modelAndView;
	}

	@RequestMapping(value="/userSave", method = RequestMethod.POST)
	public String getUser(@RequestParam("first_name") String fname, @RequestParam("last_name") String lname,
			@RequestParam("mobile") Long mobile,@DateTimeFormat(pattern = "yyyy-MM-dd") @RequestParam("dob") Date dob, @RequestParam("email") String email,
			@RequestParam("address") String address, @RequestParam("gender") String gender,
			@RequestParam("user_password") String password, @RequestParam("state") int state,
			@RequestParam("city") int city) {
		
		userService.addUser(fname,lname,mobile,email,dob,address,city,state,gender,password);;
		System.out.println("Creating User " +fname);
		return "successform";
	}
	
	@RequestMapping(value="/userlogin")
	public String loginUser()
	{
		return "loginform";
	}
	
	@RequestMapping(value="/successlogin")
	public String loginSuccess(String email,String pass)
	{
		
		return "successform";
	}
}
