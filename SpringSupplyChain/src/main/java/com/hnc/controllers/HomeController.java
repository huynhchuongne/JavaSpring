/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnc.controllers;

import com.hnc.service.CategoryService;
import com.hnc.service.ProductService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author ASUS
 */
@Controller
@ControllerAdvice
public class HomeController {
    @Autowired
    private CategoryService cateService;
    
    @Autowired
    private ProductService prodService;
    
    @ModelAttribute
    public void commAttrs(Model model) {
        model.addAttribute("categories", cateService.getCates());
    }
    
    @RequestMapping("/")
    public String index(Model model,@RequestParam Map<String, String> params){
         model.addAttribute("products", this.prodService.getProducts(params));
    return "home";
    }
}
