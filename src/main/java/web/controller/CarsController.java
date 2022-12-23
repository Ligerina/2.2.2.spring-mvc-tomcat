package web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarsController {

    private final CarService carService;

    public CarsController(CarService carService){
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int value){


        if(value>=5){
            model.addAttribute("carList",carService.index());
        } else if(value>=1 && value<5) {
            model.addAttribute("carList",carService.index().stream().limit(value).toList());
        } else {

        }

        return "/cars";
    }

}
