package com.akkidev.leadingBasket.Controller;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.ActivityImpl.ImageToPDF;
import com.akkidev.leadingBasket.Service.BankService;
import com.akkidev.leadingBasket.Service.CategoryService;
import com.akkidev.leadingBasket.Service.DocumentService;
import com.akkidev.leadingBasket.Service.LoanCategoryService;
import com.akkidev.leadingBasket.Service.SubscribeService;
import com.akkidev.leadingBasket.Service.UserService;
import com.akkidev.leadingBasket.Service.UserSubscriptionService;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;

@Controller
public class HomeLoanController {

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
	ImageToPDF pdf;
	
	@Autowired
	EncryptionPDF encPDF;

	@Autowired
	DocumentService docService;

	@Autowired
	UserSubscriptionService userSubService;
	
	 public static String uploadDir = System.getProperty("user.dir") + "/upload/UserDoc/1";

	@RequestMapping("/Home Loan")
	public ModelAndView HomeLoanCategory() throws Exception {
		ModelAndView lmd = new ModelAndView("loanService");
		lmd.addObject("title", "HOME LOAN");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("lcat1", loanCatService.getLoanCategories(1));
		return lmd;
	}

	@RequestMapping("/New Home Loan")
	public ModelAndView applyNewHomeloan() {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "New Home Loan");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(4));
		lmd.addObject("banks", bankService.getAllBankWithCharge(1));
		return lmd;
	}

	@RequestMapping("/Home Loan Top-UP")
	public ModelAndView applyHomeloantopup() {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "Home Loan Top-Up");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(5));
		lmd.addObject("banks", bankService.getAllBankWithCharge(2));
		return lmd;
	}

	@RequestMapping("/Home Loan Resale")
	public ModelAndView applyHomeLoanReSale() {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "Home Loan Resale");
		lmd.addObject("docs", docService.getDocuments());
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(5));
		lmd.addObject("banks", bankService.getAllBankWithCharge(3));
		return lmd;
	}

	@RequestMapping("/Transfer Home Loan")
	public ModelAndView transferHomeLoan() {
		ModelAndView lmd = new ModelAndView("applyServices");
		lmd.addObject("title", "Transfer Home Loan");
		lmd.addObject("subs", subService.getSubCount());
		lmd.addObject("services", prService.getServices());
		lmd.addObject("user", userService.findById(5));
		lmd.addObject("banks", bankService.getAllBankWithCharge(4));
		return lmd;
	}

	@RequestMapping(value = "/applyNewHome", method = RequestMethod.POST)
	public ModelAndView applyNewHomeLoanServie(@RequestParam("amount") long amt,@RequestParam("bank") int bank) {
		ModelAndView md = new ModelAndView();
		md.addObject("services", prService.getServices());
		md.addObject(userSubService.addUserSubscription(amt, 4, 1, 2, bank));//amount,userid,cat_id,lonsubid,bankid
		md.addObject("docs", docService.getDocuments());
		md.addObject("userdt", userSubService.findSubscriptionById(61));
		md.setViewName("UploadDocuments");
		return md;
	}
	
	
	@RequestMapping("/upLoadDoc")
	public ModelAndView updloadDocs(@RequestParam("docName") String docName,
		      @RequestParam("uploadFile") MultipartFile file)
	{	
		ModelAndView md = new ModelAndView("UploadDocuments");
		 md.addObject("services", prService.getServices());
		
		   System.out.println(docName + "------------->" + file.toString());
		    md.addObject("userdt", userSubService.findSubscriptionById(61));
		    md.addObject("docs", docService.getDocuments());
		   String extension = FilenameUtils.getExtension(file.getOriginalFilename());
		    System.out.println(extension);
		    if (!extension.equals("pdf")) {
		      Path fileNameAndPath = Paths.get(uploadDir, docName + "." + extension);
		      try {
		        Files.write(fileNameAndPath, file.getBytes());
		        pdf.imgtoPDF(uploadDir, docName, extension);
		        Files.delete(fileNameAndPath);
		      } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		      }
		    } else if (extension.equals("pdf")) {
		      Path fileNameAndPath = Paths.get(uploadDir, file.getOriginalFilename());
		      try {
		        Files.write(fileNameAndPath, file.getBytes());
		        encPDF.setPassword(fileNameAndPath, uploadDir, docName);
		        Files.delete(fileNameAndPath);
		      } catch (IOException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		      }
		    }
		return md;
	}

}
