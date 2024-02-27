package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarImplService implements carService{
    @Override
    public List<Car> carList() {
        return Car.carList;
    }
}
