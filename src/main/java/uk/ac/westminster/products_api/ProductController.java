package uk.ac.westminster.products_api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("/products")
    public List<Products> getAllProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/products/{id}")
    public Products getProductById(@PathVariable Long id) {
        return productService.getProductById().orElse(null);
    }
    @PostMapping("/products")
    public Products addProduct(@RequestBody Products product) {
        return productService.addProduct(product);
    }
    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
    @GetMapping("/products/search")
    public List<Products> search(@RequestParam String name) {
        return productService.findByName(name);
    }
    @GetMapping("/{id}")
    public Products getById(@PathVariable Long id) {
        return new Products(id, "Laptop", 999.99);
    }
}
