package com.mycompany.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.dao.TodolistDao;
import com.mycompany.entity.Todolist;

@Controller
public class MyController {

    @Autowired
    TodolistDao tld;

    // Show the form for inserting a new task
    @RequestMapping("/check")
    public String welcome() {
        return "insert";  // JSP/HTML page for inserting new tasks
    }

    // Handle the form submission for inserting a new task with image
    @PostMapping("/in1")
    @ResponseBody
    public String in(@ModelAttribute Todolist todolist,  MultipartFile file) throws IOException {
        // Convert MultipartFile to byte[]
    	if (!file.isEmpty()) {
        todolist.setT_img(file.getBytes());
        todolist.setT_name(file.getOriginalFilename());
        // Assuming there's a setT_img method in Todolist
         tld.save(todolist);
        // Continue with your logic...
         return "redirect:/success";  

        // Save the Todolist entity with image to the database
       
    	}
        // Redirect to show all tasks page
        return "redirect:/show_all_t";
    }

    // Show all tasks (and images)
    @RequestMapping("/show_all_t")
    public String showAllTasks(Model model) {
        Iterable<Todolist> tasks = tld.findAll();
        model.addAttribute("list", tasks);
        return "show_all_t";  // JSP/HTML page to display all tasks and images
    }
}
