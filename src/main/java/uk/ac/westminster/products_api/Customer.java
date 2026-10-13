package uk.ac.westminster.products_api;
public class Customer {
    private Long id;
    private String name;
    private String email;
    private String address;
    public Customer(Long id, String adaLovelace, String mail) {}
    public Customer(Long id, String name, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
    }
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }
}

