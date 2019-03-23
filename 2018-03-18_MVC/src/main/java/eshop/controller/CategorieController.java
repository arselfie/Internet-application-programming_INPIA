package eshop.controller;


import eshop.domain.Categorie;
import eshop.service.impl.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("categorie")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping("/show")
    public String show() {
        return "index";
    }

    @GetMapping(value = "/get/id")
    public void getById(@PathVariable("id") int id) {
        categorieService.getById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Categorie categorie){
        categorieService.save(categorie);
    }
}
