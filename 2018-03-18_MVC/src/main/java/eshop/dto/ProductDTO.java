package eshop.dto;

public class ProductDTO {
    private String name;
    private double price;
    private int id;

    public ProductDTO(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public ProductDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price * 10;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
