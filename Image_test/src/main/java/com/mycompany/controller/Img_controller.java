package com.mycompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.mycompany.dao.ImageDao;
import com.mycompany.entity.Image;

import java.io.IOException;

@Controller
public class Img_controller {

    @Autowired
    ImageDao imd;

    // Show the form to upload image
    @RequestMapping("/insert")
    public String insert() {
        return "insert";
    }

    // Handle the image upload and store it in the database
    @PostMapping("/insert1")
    @ResponseBody
    public String insert(@ModelAttribute Image im, MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            // Convert the file to byte array
            im.setI_img(file.getBytes());
            im.setI_name(file.getOriginalFilename());
            imd.save(im);  // Save the image to the database
            return "redirect:/show";
        }
        return "Image upload failed!";
    }

    // Show all images
    @RequestMapping("/show")
    public String show(Model model) {
        Iterable<Image> images = imd.findAll();
        model.addAttribute("images", images);
        return "show";  // The name of the view to show images
    }
}
