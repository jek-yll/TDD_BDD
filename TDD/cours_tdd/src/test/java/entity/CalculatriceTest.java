package entity;

import org.example.entity.Calculatrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {

    @Test
    void testAddiction(){
        //Arrange
        Calculatrice calculatrice = new Calculatrice();

        //Act
        double result = calculatrice.addition(10, 45);

        //Assert
        Assertions.assertEquals(55, result);
    }
    @Test
    void testDivision1(){
        //Arrange
        Calculatrice calculatrice = new Calculatrice();

        //Act
        double result = calculatrice.division(10, 2);

        //Assert
        Assertions.assertEquals(5, result);
    }

    @Test
    void testDivision2(){
        //Arrange
        Calculatrice calculatrice = new Calculatrice();

        //Act and Assert
        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            //Act
            calculatrice.division(10, 0);
        });
    }
}
