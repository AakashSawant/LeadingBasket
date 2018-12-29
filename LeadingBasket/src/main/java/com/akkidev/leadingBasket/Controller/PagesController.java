package com.akkidev.leadingBasket.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.BankService;
import com.akkidev.leadingBasket.Service.CategoryService;
import com.akkidev.leadingBasket.Service.DocumentService;
import com.akkidev.leadingBasket.Service.LoanCategoryService;
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

	@Autowired
	CategoryService catService;

	@Autowired
	LoanCategoryService loanCatService;
	
	@Autowired
	DocumentService docService;

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
	public ModelAndView loanServices() {
		ModelAndView lmd = new ModelAndView("loanService");
		lmd.addObject("title", "LOAN");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("lcat1", catService.getCategories());
		return lmd;
	}

	@RequestMapping("/Home Loan")
	public ModelAndView HomeLoanCategory() {
		ModelAndView lmd = new ModelAndView("loanService");
		lmd.addObject("title", "HOME LOAN");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("lcat1", loanCatService.getHomeLoanCategories());
		return lmd;
	}

	@RequestMapping("/Mortgage Loan")
	public ModelAndView MortgageLoanCategory() {
		ModelAndView lmd = new ModelAndView("loanService");
		lmd.addObject("title", "MORTGAGE");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("lcat1", loanCatService.getMortgageLoan());
		return lmd;
	}

	@RequestMapping("/New Home Loan")
	public ModelAndView applyNewHomeloan() {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "New Home Loan");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		return lmd;
	}

	@RequestMapping("/Home Loan Top-UP")
	public ModelAndView applyHomeloanTopUp() {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("title", "Home Loan Top-UP");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		return lmd;
	}

	@RequestMapping("/Home Loan Resale")
	public ModelAndView applyHomeLoanReSale() {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "Home Loan Resale");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		return lmd;
	}

	@RequestMapping("/Transfer Home Loan")
	public ModelAndView transferHomeLoan() {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "Transfer Home Loan");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		return lmd;
	}

	@RequestMapping("/Financial Service")
	public ModelAndView financialServices() {
		ModelAndView fmd = new ModelAndView("financialService");
		fmd.addObject("services", prService.getServices());
		return fmd;
	}

}
