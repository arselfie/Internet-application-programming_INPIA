package eshop.service.impl;

import eshop.domain.Product;
import eshop.repository.ProductRepository;
import eshop.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements CrudService<Product> {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getById(int id) {
        return productRepository.getOne(id);
    }

    @Override
    public void deleteById(int id) {
        productRepository.deleteById(id);
    }
}
