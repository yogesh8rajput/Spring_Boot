package com.mycompany.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mycompany.dao.StudentInfoDao;
import com.mycompany.entity.StudentInfo;

@Controller
public class MyController {
	@RequestMapping("/one")
//      @ResponseBody
	public String set() {
		return "welcome";
	}
	
	@RequestMapping("/")

	public String index() {
		return "index";
	}

	@RequestMapping("/one1")
//    @ResponseBody
	public String get() {
		return "index";
	}

	@Autowired
	StudentInfoDao sd;

	@RequestMapping("/insert")
	// @ResponseBody
	public String insert(@ModelAttribute StudentInfo studentInfo) {
		sd.save(studentInfo);

		return "show";
	}

	@RequestMapping("/showall")
	// @ResponseBody
	public String showall(Model mo) {
		Iterable<StudentInfo> si = sd.findAll();
		mo.addAttribute("list", si);
		return "showAll";
		
	}
	
	  @RequestMapping("/delete")
//    @ResponseBody
    public String delete(@RequestParam("id") Integer id) {
       Optional<StudentInfo> studentInfo = sd.findById(id);  // Find the doctor by ID
       if (studentInfo.isPresent()) {
         sd.delete(studentInfo.get());  
       }
       return "welcome";  
       }
	  
	  @RequestMapping("/update")
//    @ResponseBody
    public String update(@RequestParam("id") Integer id,Model mo) {
       Optional<StudentInfo> studentInfo = sd.findById(id);  // Find the doctor by ID
       if (studentInfo.isPresent()) {
    	   mo.addAttribute("studentInfo",studentInfo.get());
    	   return "update";
          
       }
       else {
       return "welcome"; } 
       }
	  
	  @RequestMapping("/update2")
//	  @ResponseBody
	  public String saveupdate(@ModelAttribute StudentInfo studentInfo)
	  {
		  sd.save(studentInfo);
		  return "welcome";
	  }
	  
	  
	  
	 
   
	  
	  
}
