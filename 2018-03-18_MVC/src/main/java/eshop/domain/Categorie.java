package eshop.domain;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Categorie {

    @Id
    @GeneratedValue
    @Column(name = "categorie_id")
    private int id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "categorie", orphanRemoval = true)
    private List<Product> productList = new LinkedList<>();

    public Categorie() {
    }

    public Categorie(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
