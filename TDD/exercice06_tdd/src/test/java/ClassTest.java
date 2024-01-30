import org.example.entity.Agency;
import org.example.entity.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassTest {

    @Test
    void methodeTest(){
        Car car = Car.builder().builder().RentDueIn(0).Condition(50).build();
        Agency agency = Agency.builder().Car(car);

        agency.dailyRoutine();

        Assertions.assertEquals(48, agency.getCondition());
    }

}
