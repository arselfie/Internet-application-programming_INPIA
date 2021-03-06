package eshop.repository;

import eshop.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
