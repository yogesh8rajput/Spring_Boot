package com.mycompany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @RequestMapping("/test")
//    @ResponseBody
	public String home()
	{
		return "view";
	}
    
    @RequestMapping("/test1")
//  @ResponseBody
	public String well()
	{
		return "index";
	}
}
