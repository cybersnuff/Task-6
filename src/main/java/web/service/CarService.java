package web.service;

import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.List;

public interface CarService {

     List<Car> carList(Integer integer);

}
