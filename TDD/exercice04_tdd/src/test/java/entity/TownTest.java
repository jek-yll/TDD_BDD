package entity;

import org.example.entity.Town;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TownTest {

    private Town town;
    @Test
    void testTownLengthLessThan2ThrowException(){
        Town town = new Town();
        town.setTownSearched("V");

        Assertions.assertThrowsExactly(ClassNotFoundException.class, () -> {
            town.findTown(town.getTownSearched());
        });
    }

    @Test
    void testTownLengthGreaterOrEqualThan2(){
        Town town = new Town();
        town.setTownSearched("Va");

        List<String> res = null;

        Assertions.assertTrue(res.stream().anyMatch("Va"::equalsIgnoreCase));
    }

    @Test
    void testTownSearchIgnoreCase(){
        Town town = new Town();

    }

}
