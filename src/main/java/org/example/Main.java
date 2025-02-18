package org.example;


import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CreateCarService createCarService = new CreateCarService();
        List<Car> cars = createCarService.create();
        System.out.println(cars);
        System.out.println(cars);

        System.out.println(LocalDate.of(2025, 2, 10).isBefore(LocalDate.of(2025, 2, 4)));
    }
}