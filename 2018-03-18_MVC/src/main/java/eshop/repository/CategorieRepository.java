package eshop.repository;

import eshop.domain.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {
}
