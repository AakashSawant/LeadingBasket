package com.akkidev.leadingBasket.Controller;

import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.UserSubscriptionDocService;
import com.akkidev.leadingBasket.Service.UserSubscriptionService;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;

@Controller
public class DocumentController {

	@Autowired
	ProductServiceImpl prService;

	@Autowired
	UserSubscriptionDocService documentService;

	@Autowired
	UserSubscriptionService userSubService;

	@RequestMapping("/uploadDocs")
	public ModelAndView uploadDocsPage() {
		ModelAndView md = new ModelAndView("UploadDocuments");
		md.addObject("services", prService.getServices());
		return md;

	}
	@RequestMapping("/add-document-{id}")
	public ModelAndView addDocuments(@PathVariable("usId") int id,MultipartFile files)
	{
		
		return null;	
	}

}
