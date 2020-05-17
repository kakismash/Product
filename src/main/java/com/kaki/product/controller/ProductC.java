/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaki.product.controller;
;

import com.kaki.product.model.entity.Product;
import com.kaki.product.model.service.IProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author alfia
 */
@RestController
public class ProductC {
    
    @Autowired
    private IProductService productService;
    
    @GetMapping("/list")
    public List<Product> list() {
        return productService.findAll();
    }
    
    @GetMapping("/list/{id}")
    public Product details(@PathVariable Long id) {
        return productService.findById(id);
    }
    
}
