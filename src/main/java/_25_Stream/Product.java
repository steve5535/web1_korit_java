package _25_Stream;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor @Data @Builder
public class Product {
    private int productId; // 식별용 - 객체마다 유일한 데이터
    private String productName;
    private boolean onSale;
    private int stock;
    private int price;

    // 변환책임을 entity나 dto가 가질 수 있다.
    public Product toSalePrice() {
        return Product.builder()
                .onSale(this.onSale)
                .productId(this.productId)
                .productName(this.productName)
                .stock(this.stock)
                .price((int) (this.price * 0.9))
                .build();
    }
}
