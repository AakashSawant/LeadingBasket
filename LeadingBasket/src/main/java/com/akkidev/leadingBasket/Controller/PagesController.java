package com.akkidev.leadingBasket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.entities.user_master;

@Controller
public class PagesController {

	
	@RequestMapping("/")
	public String pagesHandler() throws Exception {

		return "index";
	}
}
