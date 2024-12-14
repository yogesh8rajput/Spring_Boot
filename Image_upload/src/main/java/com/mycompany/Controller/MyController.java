package com.mycompany.Controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.dao.SchoolDao;
import com.mycompany.entity.School;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class MyController {

	@Autowired
	SchoolDao schooldao;
	@RequestMapping("/image")
//	@ResponseBody
	public String image() {
		return "image_insert";
	}
	
	 @PostMapping("/image1")
	 @ResponseBody
	public String images(@ModelAttribute School school,MultipartFile file) throws IOException {
		 if (!file.isEmpty()) {		
			 school.setS_img(file.getBytes());
			 schooldao.save(school);
			 return "redirect:/show";
			 
			 
		 }
		return "hello";
	}
	
	
}
