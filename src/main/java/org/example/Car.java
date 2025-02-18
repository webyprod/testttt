package org.example;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Car {

    /* Ceci est la class Model */

    private String colorDoor;
    private String colorWheel;
    private String colorWindshield;
    private String colorWindow;
    private String colorRoof;


    public static List<Car> getListCars () {

        List<Car> cars = new ArrayList<>();
        Car car1 =  Car.builder().colorDoor("red").build();
        Car car2 =  Car.builder().colorDoor("green").build();
        Car car3 =  Car.builder().colorDoor("blue").build();
        Car car4 =  Car.builder().colorDoor("yellow").build();
        Car car5 =  Car.builder().colorDoor("black").build();
        Car car6 =  Car.builder().colorDoor("white").build();
        Car car7 =  Car.builder().colorDoor("grey").build();
        Car car8 =  Car.builder().colorDoor("pink").build();
        Car car9 =  Car.builder().colorDoor("cyan").build();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        return cars;
    }

}
