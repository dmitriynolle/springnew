package com.spring.controllers;

import com.spring.entities.Product;
import com.spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path="/products", method=RequestMethod.GET)
    @ResponseBody
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

//    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
//    public Product getProductById(@PathVariable("id") Long id){
//        return productService.getProductById(id);
//    }
//
//    @RequestMapping(value = "/product", method = RequestMethod.GET)
//    public List<Product> getProductsByVendor(@RequestParam("id") String id){
//        return productService.getProductsByVendorCode(id);
//    }
}
