package com.akkidev.leadingBasket.Controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ErrorHandleController implements org.springframework.boot.web.servlet.error.ErrorController {

	@Override
	public String getErrorPath() {

		return "/error";
	}

	@RequestMapping("/error")
	public ModelAndView handleError(HttpServletRequest WebRequest) {
		ModelAndView lmd = new ModelAndView();

		Object status = WebRequest.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
		if (status != null) {
			Integer stCode = Integer.valueOf(status.toString());
			if (stCode == HttpStatus.NOT_FOUND.value()) {
				lmd.addObject("eccode", "404");
				lmd.addObject("ecdes", "Page Not Found");
				lmd.setViewName("errors");
				return lmd;
			} else if (stCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
				lmd.addObject("eccode", "500");
				lmd.addObject("ecdes", "Internal Server Error");
				lmd.setViewName("errors");
				return lmd;
			}
			else if (stCode == HttpStatus.FORBIDDEN.value()) {
				lmd.addObject("eccode", "403");
				lmd.addObject("ecdes", "Forbidden");
				lmd.setViewName("errors");
				return lmd;
			}
		}
		lmd.addObject("ecdes", "Somthing Is Wrong");
		lmd.setViewName("errors");
		return lmd;
	}

}
