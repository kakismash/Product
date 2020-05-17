/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaki.product.model.service;

import com.kaki.product.model.entity.Product;
import java.util.List;

/**
 *
 * @author alfia
 */
public interface IProductService {
    
    public List<Product> findAll();
    
    public Product findById(Long id);
    
}
