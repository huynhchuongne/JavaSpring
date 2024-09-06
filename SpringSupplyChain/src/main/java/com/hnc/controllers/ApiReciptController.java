/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnc.controllers;

import com.hnc.filters.Cart;
import com.hnc.service.ReceiptService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/api")
public class ApiReciptController {

    @Autowired
    private ReceiptService receiptService;
    
    @PostMapping("/pay")
    @ResponseStatus(HttpStatus.CREATED)
    public void pay(@RequestBody List<Cart> carts) {
        this.receiptService.addReceipt(carts);
    }
}
