package academy.digitallab.store.shopping.client;

import academy.digitallab.store.shopping.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductHystrixFallbackFactory implements ProductClient{
    @Override
    public ResponseEntity<Product> getProduct(Long id) {
        Product product = Product.builder()
               . name("none")
                .description("none")
                .stock(Double.NaN)
                .price(Double.NaN).build();
        return ResponseEntity.ok(product);
    }

    @Override
    public ResponseEntity<Product> updateStockProduct(Long id, Double quantity) {
        Product product = Product.builder()
                . name("none")
                .description("none")
                .stock(Double.NaN)
                .price(Double.NaN).build();
        return ResponseEntity.ok(product);
    }
}
