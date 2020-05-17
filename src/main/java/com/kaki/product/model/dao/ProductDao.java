/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kaki.product.model.dao;

import com.kaki.product.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author alfia
 */
public interface ProductDao extends CrudRepository<Product, Long>{
    
    
    
}
