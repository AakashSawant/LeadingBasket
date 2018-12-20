package com.akkidev.leadingBasket.Controller;

import java.util.Collection;
import java.util.Map;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.UserService;
import com.akkidev.leadingBasket.entities.city_master;
import com.akkidev.leadingBasket.entities.state_master;
import com.akkidev.leadingBasket.entities.user_master;

@Controller
@RequestMapping(value = { "/user" })
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
		modelAndView.addObject("city",userService.getCities());
		modelAndView.addObject("state",userService.getState());
		modelAndView.setViewName("registration");
		return modelAndView;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("contact_form") user_master user, BindingResult result) {
			userService.addUser(user);
			System.out.println("Creating User " + user.getFirst_name());
			return "registration";
	}

}
