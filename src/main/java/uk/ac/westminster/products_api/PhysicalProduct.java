package uk.ac.westminster.products_api;

public class PhysicalProduct extends Products {
    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
        super();
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {
        super(id, name, price);
        this.dimensions = dimensions;
        this.weightKg = weightKg;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }
}
