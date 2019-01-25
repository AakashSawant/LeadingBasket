package com.akkidev.leadingBasket.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.BankService;
import com.akkidev.leadingBasket.Service.CategoryService;
import com.akkidev.leadingBasket.Service.DocumentService;
import com.akkidev.leadingBasket.Service.LoanCategoryService;
import com.akkidev.leadingBasket.Service.SubscribeService;
import com.akkidev.leadingBasket.Service.UserService;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;

@Controller
public class BussinessLoanController {

	@Autowired
	ProductServiceImpl prService;

	@Autowired
	UserService userService;

	@Autowired
	SubscribeService subService;

	@Autowired
	BankService bankService;

	@Autowired
	CategoryService catService;

	@Autowired
	LoanCategoryService loanCatService;

	@Autowired
	DocumentService docService;

	@RequestMapping("/Business Loan")
	public ModelAndView BussinessLoanCategory() {
		ModelAndView lmd = new ModelAndView("loanService");
		lmd.addObject("title", "New Business Loan");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("lcat1", loanCatService.getLoanCategories(4));
		return lmd;
	}
	@RequestMapping("/New Bussiness Loan")
	public ModelAndView applyNewBussinessloan()  {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "New Bussiness Loan");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(5));
		lmd.addObject("banks",bankService.getAllBankWithCharge(10));
		return lmd;	
	}
}
