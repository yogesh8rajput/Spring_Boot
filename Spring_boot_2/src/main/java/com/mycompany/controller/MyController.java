package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
      @RequestMapping("/one")
//      @ResponseBody
	 public String set()
	 {
		 return "welcome";
	 }
      
      @RequestMapping("/one1")
//    @ResponseBody
	 public String get()
	 {
		 return "index";
	 }
}
