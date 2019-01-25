package com.akkidev.leadingBasket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.JanatriService;
import com.akkidev.leadingBasket.Service.SubscribeService;
import com.akkidev.leadingBasket.Service.UserService;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;

@Controller
public class CalculatorController {

	@Autowired
	ProductServiceImpl prService;

	@Autowired
	SubscribeService subService;
	
	@Autowired
	JanatriService janService;
	
	

	@RequestMapping("/emiCalculator")
	public ModelAndView emiCalc() {
		ModelAndView md = new ModelAndView("emiCalculator");
		md.addObject("services", prService.getServices());
		md.addObject("subs", subService.getSubCount());
		return md;
	}
	
	@RequestMapping("/unitConversion")
	public ModelAndView unitConvesion()
	{
		ModelAndView md = new ModelAndView("unitConvertor");
		md.addObject("services", prService.getServices());
		md.addObject("subs", subService.getSubCount());
		return md;
		
	}
	
	@RequestMapping("/janatriCalculator")
	public ModelAndView janatriCalc()
	{
		ModelAndView md = new ModelAndView("janatricalc");
		md.addObject("services", prService.getServices());
		md.addObject("subs", subService.getSubCount());
		md.addObject("janstate",janService.getAllStates());
		md.addObject("jancity",janService.getAllCities());
		md.addObject("janArea",janService.getAllAreas());
		md.addObject("janProperty",janService.getAllProperties());
		return md;
	}
}
