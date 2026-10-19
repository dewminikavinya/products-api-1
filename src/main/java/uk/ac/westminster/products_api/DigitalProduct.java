package uk.ac.westminster.products_api;

public class DigitalProduct extends Products {
    private String downloadUrl;
    private double fileSizeMB;

    public DigitalProduct() {
        super();

    }
    public DigitalProduct(Long id, String name, double price,
                        String downloadUrl, double fileSizeMB) {
        super(id, name, price); // MUST be the first statement
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }
    public String getDownloadUrl() {
        return downloadUrl;
    }
    public double getFileSizeMB() {
    return fileSizeMB;
}
    }