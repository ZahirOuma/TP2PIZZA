package com.example.pizzarecipes.service;

import com.example.pizzarecipes.classes.Produit;
import com.example.pizzarecipes.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> produits;

    public ProduitService() {
        produits = new ArrayList<>();
    }

    @Override
    public boolean create(Produit o) {
        return produits.add(o);
    }
    public boolean delete(Produit o){
        return produits.remove(o);
    }
    public boolean update(Produit o){
        return false;
    }
    public Produit findById(int id){
        for(Produit p:produits){
            if(p.getId()==id){
                return p;
            }

        }
        return null;
    }
    public List<Produit> findAll(){
        return produits;
    }
}
