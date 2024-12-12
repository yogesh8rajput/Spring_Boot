package com.mycompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycompany.dao.TodolistDao;
import com.mycompany.entity.Todolist;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {

	@Autowired
	TodolistDao tld;
	
	@RequestMapping("/check")
	public String welcome()
	{
		return "insert";
	}
	
	  @RequestMapping("/insert")
	   public String insert(@ModelAttribute Todolist todolist)
	   {
		   tld.save(todolist);
		   return "redirect:/show_all_t";
		   
	   }
	  
	  
	  @RequestMapping("/show_all_t")   
	  public String show_all_t(Model mo) {
		Iterable<Todolist> td=tld.findAll();
		mo.addAttribute("list",td);
		
		  return  "show_all_t";
	}
	  
}
