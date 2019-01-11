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
import com.akkidev.leadingBasket.Service.UserSubscriptionService;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;

@Controller
public class MortgageLoanController {

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
	
	@RequestMapping("/Mortgage Loan")
	public ModelAndView MortgageLoanCategory() {
		ModelAndView lmd = new ModelAndView("loanService");
		lmd.addObject("title", "MORTGAGE");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("lcat1", loanCatService.getLoanCategories(2));
		return lmd;
	}
	
	
	@RequestMapping("/Mortgage Loan New")
	public ModelAndView applyNewMorgegeloan()  {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "New Mortgage Loan");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(5));
		lmd.addObject("banks",bankService.getAllBankWithCharge(5));
		return lmd;	
	}
	@RequestMapping("/Mortgage Loan Top Up")
	public ModelAndView ApplyMortgageLoanTopUp()  {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "Mortgage Loan Top Up");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(5));
		lmd.addObject("banks",bankService.getAllBankWithCharge(6));
		return lmd;	
	}
	@RequestMapping("/Mortgage Loan for Commurcial Purchase")
	public ModelAndView applyMorgageLoanCP()  {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "Mortgage Loan for Commurcial Purchase");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(5));
		lmd.addObject("banks",bankService.getAllBankWithCharge(7));
		return lmd;	
	}
	@RequestMapping("/Mortgage Transfer")
	public ModelAndView applyMortgegTransform()  {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "Mortgage Transfer");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(5));
		lmd.addObject("banks",bankService.getAllBankWithCharge(8));
		return lmd;	
	}
}
