package com.akkidev.leadingBasket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.BankService;
import com.akkidev.leadingBasket.Service.SubscribeService;
import com.akkidev.leadingBasket.Service.UserService;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;

@Controller
public class PagesController {

	@Autowired
	ProductServiceImpl prService;

	@Autowired
	UserService userService;

	@Autowired
	SubscribeService subService;

	@Autowired
	BankService bankService;

	@RequestMapping("/")
	public ModelAndView pagesHandler() {
		ModelAndView md = new ModelAndView("index");
		md.addObject("services", prService.getServices());
		md.addObject("users", userService.getUserCount());
		md.addObject("subs", subService.getSubCount());
		md.addObject("banks", bankService.getBankCount());
		return md;
	}

	@RequestMapping(value = "/subscribe")
	public ModelAndView getSubScriber(@RequestParam("emid") String sb) {
		System.out.println(sb);
		ModelAndView mad = new ModelAndView("index");
		mad.addObject("sub", subService.addSubscriber(sb));
		return mad;

	}
	
	@RequestMapping("/Loan Service")
	public ModelAndView loanServices()
	{
		ModelAndView lmd = new ModelAndView("loanService");
		lmd.addObject("services",prService.getServices());
		return lmd;
	}
	
	@RequestMapping("/Financial Service")
	public ModelAndView financialServices()
	{
		ModelAndView fmd = new ModelAndView("financialService");
		fmd.addObject("services",prService.getServices());
		return fmd;
	}

}
