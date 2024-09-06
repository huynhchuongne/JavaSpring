/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnc.controllers;

import com.hnc.pojo.Category;
import com.hnc.service.CategoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/api")
public class ApiCategoryController {
    @Autowired
    private CategoryService cateService;
    @CrossOrigin
    @GetMapping("/categories")
    public ResponseEntity<List<Category>> list(){
      return new ResponseEntity<>(this.cateService.getCates(), HttpStatus.OK);
    }
        
}
