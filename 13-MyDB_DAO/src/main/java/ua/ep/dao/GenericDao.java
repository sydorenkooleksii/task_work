package ua.ep.dao;

import java.util.List;

/**
 * Created by Oleksii_Sydorenko on 10/4/2016.
 */
public interface GenericDao<T> {
    T find(int id);
    List<T> findAll();
    void update(T entity);
    void delete(int id);
    void insert(T entity);
}