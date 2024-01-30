import exception.ConditionException;
import org.example.entity.Agency;
import org.example.entity.Car;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClassTest {

    @Test
    void testDailyRoutineWhenRentDuInEqual0DoubleDecreaseConditionCar(){
        Car car = Car.builder().RentDueIn(0).Condition(50).build();
        Agency agency = Agency.builder().car(car).build();

        agency.dailyRoutine();

        Assertions.assertEquals(44, car.getCondition());
    }

    @Test
    void testDailyRoutineThrowConditionExceptionWhenConditionCarEqual0(){
        Car car = Car.builder().RentDueIn(0).Condition(0).build();
        Agency agency = Agency.builder().car(car).build();

        Assertions.assertThrowsExactly(ConditionException.class, () -> {
            agency.dailyRoutine();
        });
    }

    @Test
    void testDailyThrowConditionExceptionWhenConditionCarGreaterThan100(){
        Car car = Car.builder().RentDueIn(0).Condition(101).build();
        Agency agency = Agency.builder().car(car).build();

        Assertions.assertThrowsExactly(ConditionException.class, () -> {
            agency.dailyRoutine();
        });
    }

}
