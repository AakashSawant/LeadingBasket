package com.akkidev.leadingBasket.Controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.akkidev.leadingBasket.Service.UserSubscriptionDocService;
import com.akkidev.leadingBasket.Service.UserSubscriptionService;
import com.akkidev.leadingBasket.ServiceImpl.ProductServiceImpl;
import com.akkidev.leadingBasket.entities.user_subscription;
import com.akkidev.leadingBasket.entities.user_subscription_doc;
import com.akkidev.leadingBasket.suppoters.FileBucket;

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

	@RequestMapping("/add-document-{userId}")
	public String addDocument(@PathVariable int userId, ModelMap map) {
		user_subscription_doc subDoc = documentService.findById(userId);
		map.addAttribute("docs", subDoc);

		FileBucket file = new FileBucket();
		map.addAttribute("fileBucket", file);

		List<user_subscription_doc> documents = documentService.findAllByUserId(userId);
		map.addAttribute("documents", documents);
		return "UploadDocuments";

	}

	@RequestMapping(value = { "/add-document-{userId}" }, method = RequestMethod.POST)
	public String uploadDocument(@Valid FileBucket fileBucket, BindingResult result, ModelMap model,
			@PathVariable int userId) throws IOException {
		if (result.hasErrors()) {
			System.out.println("validation errors");
			model.addAttribute("user", userSubService.findSubscriptionById(userId));
			model.addAttribute("documents", documentService.findById(userId));
			return "UploadDocuments";
		} else {
			System.out.println("Fetching file");

			user_subscription user = userSubService.findSubscriptionById(userId);
			model.addAttribute("user", user);

			saveDocument(fileBucket, user);

			return "redirect:/add-document-" + userId;
		}
	}

	private void saveDocument(FileBucket fileBucket, user_subscription user) throws IOException {
			
		user_subscription_doc documents = new user_subscription_doc();
		MultipartFile multipartFile = fileBucket.getFile();
		documents.setPdf_name(multipartFile.getOriginalFilename());
		documents.setContent(multipartFile.getBytes());
		documents.setPdf_name(fileBucket.getDescription());
		documents.setUs(user);
		//FileCopyUtils.copy(fileBucket.getFile().getBytes(), new File("E:\\Spring Boot"));
		documentService.saveDocument(documents);
	}
}
