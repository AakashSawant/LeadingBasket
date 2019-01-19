package com.akkidev.leadingBasket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.SubscribeService;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;

@Controller
public class CalculatorController {

	@Autowired
	ProductServiceImpl prService;

	@Autowired
	SubscribeService subService;

	@RequestMapping("/emiCalculator")
	public ModelAndView emiCalc() {
		ModelAndView md = new ModelAndView("emiCalculator");
		md.addObject("services", prService.getServices());
		md.addObject("subs", subService.getSubCount());
		return md;
	}
}
