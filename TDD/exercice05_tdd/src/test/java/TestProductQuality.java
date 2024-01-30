import org.example.entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestProductQuality {

    private Product product;

    @BeforeEach
    void setUp() {
        Product product = new Product();
    }

    @Test
    void testUpdateWhenSellinEqual0(){
        Product product = new Product();
        product.setSellin(0);
        product.setQuality(20);
        product.update();

        Assertions.assertEquals(18, product.getQuality());
    }

    @Test
    void testUpdateQualityWhenQuatiyIsNegative(){
        Product product = new Product();
        product.setQuality(-1);

        Assertions.assertFalse(product.getQuality()<0);
    }

    @Test
    void testUpdateQualityIsNeverGreaterThan50(){

    }

    @Test
    void testUpdateWhenSellinForBrieIncreaseQualityIncrease(){

    }
}
