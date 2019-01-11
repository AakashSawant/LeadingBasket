package com.akkidev.leadingBasket.Controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.BankService;
import com.akkidev.leadingBasket.Service.CategoryService;
import com.akkidev.leadingBasket.Service.DocumentService;
import com.akkidev.leadingBasket.Service.LoanCategoryService;
import com.akkidev.leadingBasket.Service.SubscribeService;
import com.akkidev.leadingBasket.Service.UserService;
import com.akkidev.leadingBasket.Service.UserSubscriptionService;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;
import com.akkidev.leadingBasket.entities.category_master;
import com.akkidev.leadingBasket.entities.user_master;

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

	@Autowired
	UserSubscriptionService userSubService;

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
		ModelAndView mad = new ModelAndView("successform");
		mad.addObject("sub", subService.addSubscriber(sb));
		mad.addObject("msg", "Thanks Subscribe Our Service " + sb);
		return mad;

	}

	@RequestMapping("/Loan Service")
	public ModelAndView loanServices() {
		ModelAndView lmd = new ModelAndView("loanService");
		lmd.addObject("title", "LOAN");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("lcat1", catService.getCategories(1));
		return lmd;
	}

	@RequestMapping(value = "/applyNewHome", method = RequestMethod.POST)
	public ModelAndView applyNewHomeLoanServie(@RequestParam("amount") long amt) {
		ModelAndView md = new ModelAndView();
		md.addObject(userSubService.addUserSubscription(amt));
		md.setViewName("successform");
		return md;
	}

	@RequestMapping("/Financial Service")
	public ModelAndView financialServices() {
		ModelAndView fmd = new ModelAndView("financialService");
		fmd.addObject("services", prService.getServices());
		return fmd;
	}

}
