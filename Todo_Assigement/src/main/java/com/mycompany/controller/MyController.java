package com.mycompany.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.dao.CompanyDao;
import com.mycompany.entity.Company;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class MyController {
      
	@Autowired
	CompanyDao companydao;
	
	
	@RequestMapping("/test")
	public String data() {
		return "index";
	}
	
	@PostMapping("/insert1")
	@ResponseBody
	public String datas(@ModelAttribute Company company, MultipartFile file) throws IOException {
	    if (!file.isEmpty()) {
	        company.setC_img(file.getBytes());
	        company.setC_name(file.getOriginalFilename());
	        companydao.save(company);
	        return "redirect:/success";  // Redirect to a success page or another controller method
	    }
	    return "show_all_t";
	}

}

	

