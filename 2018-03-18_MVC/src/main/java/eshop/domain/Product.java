package eshop.domain;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private int id;

    private String name;

    private double price;

    @Enumerated(EnumType.STRING)
    private Manufacturer manufacturer;

    @ManyToOne(fetch = FetchType.LAZY)
    private Categorie categorie;

    public Product(String name, double price, Manufacturer manufacturer, Categorie categorie) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.categorie = categorie;
    }

    public Product() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
