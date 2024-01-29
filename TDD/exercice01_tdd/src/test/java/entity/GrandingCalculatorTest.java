package entity;

import org.example.entity.GradingCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrandingCalculatorTest {

    @Test
    void testGetGrade1(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(90);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('A', result);
    }
    @Test
    void testGetGrade2(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(85);
        gradingCalculator.setAttendancePercentage(90);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('B', result);
    }
    @Test
    void testGetGrade3(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(90);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('C', result);
    }
    @Test
    void testGetGrade4(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(65);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('B', result);
    }
    @Test
    void testGetGrade5(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(95);
        gradingCalculator.setAttendancePercentage(55);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F', result);
    }
    @Test
    void testGetGrade6(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(65);
        gradingCalculator.setAttendancePercentage(55);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F', result);
    }
    @Test
    void testGetGrade7(){
        GradingCalculator gradingCalculator = new GradingCalculator();
        gradingCalculator.setScore(50);
        gradingCalculator.setAttendancePercentage(90);

        char result = gradingCalculator.getGrade();

        Assertions.assertEquals('F', result);
    }
}
