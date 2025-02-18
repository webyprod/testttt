package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreateCarService {

    private ColorService colorService;

    private List<Car> cars;

    public CreateCarService () {
        cars = Car.getListCars();
        colorService = new ColorService();
    }

    public List<Car> create () {

        List<Car> cars1 = new ArrayList<>();
        cars1 = cars.stream().map(car -> {
            Car c = car;
            c.setColorRoof(colorService.getColorRoof());
            c.setColorWheel(colorService.getColorWheels());
            c.setColorWindow(colorService.getColorWindow());
            c.setColorWindshield(colorService.getColorWindshield());
            return c;
        }).collect(Collectors.toList());
        return cars1;
    }

}
