package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;


@Controller
public class ControllerCar {

    @Autowired
    private final CarService carService;

    public ControllerCar(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCar(Model model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("carList", carService.carList(count));
        return "cars";
    }

}