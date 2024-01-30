package org.example.entity;

import exception.ConditionException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Agency {
    private Car car;

    public void dailyRoutine(){

        int decreaseConditionCar = 3;

        if (car.getCondition() == 0 || car.getCondition() > 100){
            throw new ConditionException();
        }

        if (car.getRentDueIn() == 0){
            decreaseConditionCar = 6;
        }

        car.setCondition(car.getCondition() - decreaseConditionCar);
    }
}
