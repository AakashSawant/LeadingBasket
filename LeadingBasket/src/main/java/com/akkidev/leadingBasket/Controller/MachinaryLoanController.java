package com.akkidev.leadingBasket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.BankService;
import com.akkidev.leadingBasket.Service.DocumentService;
import com.akkidev.leadingBasket.Service.LoanCategoryService;
import com.akkidev.leadingBasket.Service.ProductService;
import com.akkidev.leadingBasket.Service.SubscribeService;
import com.akkidev.leadingBasket.Service.UserService;

@Controller
public class MachinaryLoanController {

	@Autowired
	DocumentService docService;
	
	@Autowired
	ProductService prService;
	
	@Autowired
	BankService bankService;

	@Autowired
	UserService userService;

	@Autowired
	SubscribeService subService;

	@Autowired
	LoanCategoryService loanCatService;
	
	@RequestMapping("/Machinery Loan")
	public ModelAndView MachianryLoanCategory() {
		ModelAndView lmd = new ModelAndView("loanService");
		lmd.addObject("title", "Machinery Loan");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("lcat1", loanCatService.getLoanCategories(3));
		return lmd;
	}
	@RequestMapping("/New Machinary Loan")
	public ModelAndView applyNewMachinaryloan()  {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "New Machinary Loan");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(5));
		lmd.addObject("banks",bankService.getAllBankWithCharge(9));
		return lmd;	
	}
}
