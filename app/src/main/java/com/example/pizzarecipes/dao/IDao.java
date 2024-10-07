package com.example.pizzarecipes.dao;
import java.util.List;

public interface IDao <T>{
    boolean create(T o);
    boolean delete(T o);
    boolean update(T o);
    List<T> findAll();
    T findById(int id);

}
