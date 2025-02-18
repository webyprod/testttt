package org.example;


import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // TEST 1 2 3 4 5
        CreateCarService createCarService = new CreateCarService();
        List<Car> cars = createCarService.create();
        List<Car> cars2 = createCarService.create();
        List<Car> cars4 = createCarService.create();
        List<Car> cars5 = createCarService.create();
        System.out.println(cars);
        System.out.println(cars);
        System.out.println(cars4);
        System.out.println(cars4);
        System.out.println(cars4);
        System.out.println(cars4);
        System.out.println(cars4);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars2);
        System.out.println(cars5);
        System.out.println(cars5);
        System.out.println(cars5);
        System.out.println(cars5);

        System.out.println(LocalDate.of(2025, 2, 10).isBefore(LocalDate.of(2025, 2, 4)));
    }
}