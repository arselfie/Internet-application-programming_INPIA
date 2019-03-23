package eshop.service;

public interface CrudService<T> {
    void save(T entity);
    T getById(int id);
    void deleteById(int id);
}
