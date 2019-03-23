package eshop.service.impl;

import eshop.domain.Categorie;
import eshop.repository.CategorieRepository;
import eshop.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CategorieService implements CrudService<Categorie> {

    @Autowired
    private CategorieRepository categorieRepository;

    @Override
    public void save(Categorie entity) {
        categorieRepository.save(entity);
    }

    @Override
    public Categorie getById(int id) {
        return categorieRepository.getOne(id);
    }

    @Override
    public void deleteById(int id) {
        categorieRepository.deleteById(id);

    }
}
