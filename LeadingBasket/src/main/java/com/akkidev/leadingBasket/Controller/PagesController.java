package com.akkidev.leadingBasket.Controller;

import java.io.IOException;
import java.net.URI;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.codec.binary.Base64;
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
import com.akkidev.leadingBasket.entities.subcribe;
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
		ModelAndView mad = new ModelAndView();
		/*List<subcribe> ex = subService.getListSub();
		if(ex.get(2).equals(subService.findSubByEmail(sb)))
		{
			mad.addObject("msg","Aready Ecists");
			mad.setViewName("");
			 
		}
		else
		{*/
		mad.addObject("sub", subService.addSubscriber(sb));
		mad.addObject("msg", "Thanks Subscribe Our Service " + sb);
		mad.setViewName("successform");
	//	}
		return mad;

	}

	@RequestMapping("/Loan Service")
	public ModelAndView loanServices(HttpServletRequest request) throws Exception {

		ModelAndView lmd = new ModelAndView("loanService");
		String url = request.getRequestURI().replaceAll("%20", " ");
		URLDecoder.decode(url, "UTF-8");
		lmd.addObject("title", "LOAN");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		byte[] encode64 = Base64.encodeBase64(new category_master().getProductImage());
		lmd.addObject("lcat1", catService.getCategories(1));
		lmd.addObject(url);
		return lmd;
	}

	@RequestMapping("/Financial Service")
	public ModelAndView financialServices() {
		ModelAndView fmd = new ModelAndView("financialService");
		fmd.addObject("services", prService.getServices());
		return fmd;
	}

}
