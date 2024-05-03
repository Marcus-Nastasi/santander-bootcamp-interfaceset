package com.santander.interfaceset.Ordenation.Store;

import java.util.HashSet;
import java.util.Set;

public class ProductStorage {

    private final Set<Product> productSet = new HashSet<>();

    public ProductStorage() {}

    public void addProduct(String name, int id, int qnt, double price) {
        this.productSet.add(new Product(name, id, qnt, price));
    }

    public Set<Product> getAll() throws RuntimeException {
        if(this.productSet.isEmpty()) throw new RuntimeException("Storage is empty");
        Set<Product> products = new HashSet<>();
        for(Product p: this.productSet) products.add(p);
        return products;
    }

    public Set<Product> searchByName(String name) throws RuntimeException {
        if(this.productSet.isEmpty()) throw new RuntimeException("Storage is empty");
        Set<Product> products = new HashSet<>();
        for(Product p: this.productSet) if(p.getName().startsWith(name)) products.add(p);
        return products;
    }

    public Set<Product> searchByPriceRange(double start, double finish) throws RuntimeException {
        if(this.productSet.isEmpty()) throw new RuntimeException("Storage is empty");
        Set<Product> products = new HashSet<>();
        for(Product p: this.productSet) if(p.getPrice() >= start && p.getPrice() <= finish) products.add(p);
        return products;
    }
}


