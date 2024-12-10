package com.mycompany.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
