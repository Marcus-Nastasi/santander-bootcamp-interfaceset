package com.santander.interfaceset.Ordenation.Store;

import java.util.Objects;

public class Product {

    private final String name;
    private final int id;
    private final int quantity;
    private final double price;

    public Product(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return(
            "Product{" + "name='" + name + '\'' +
            ", id=" + id + ", quantity=" + quantity +
            ", price=" + price + '}'
        );
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
