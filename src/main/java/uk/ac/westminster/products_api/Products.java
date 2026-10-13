package uk.ac.westminster.products_api;

public class Products {
    public Long id;
    public String name;
    public double price;

    public Products(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
