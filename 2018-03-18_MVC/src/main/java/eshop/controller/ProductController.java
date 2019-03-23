package eshop.controller;

import eshop.domain.Product;
import eshop.dto.ProductDTO;
import eshop.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(value = "/get/id")
    public void getById(@PathVariable("id") int id) {
        productService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Product product){
        productService.save(product);
    }

    @PostMapping("/save/dto")
    public void save(@RequestBody ProductDTO dto){
        System.out.println();
    }



}
