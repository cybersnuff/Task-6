package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("BMW", "Black", 2019));
        listCar.add(new Car("Lada", "Red", 2020));
        listCar.add(new Car("Reno", "Green", 2010));
        listCar.add(new Car("Toyota", "Yellow", 1997));
        listCar.add(new Car("Kia", "White", 2023));
        if (count != null && count >= 1 && count < 5) {
            listCar = listCar.subList(0, count);
        }
        return listCar;
    }
}
