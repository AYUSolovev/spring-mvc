package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getTableCars(@RequestParam(name = "count", required = false) String count, Model model) {
        List<Car> cars;
        carService.add();
        if (count != null &&
                Integer.parseInt(count) > 0 && Integer.parseInt(count) < 5) {
            cars = carService.getCars(Integer.parseInt(count));
        } else {
            cars = carService.getCars(5);
        }
        model.addAttribute("cars", cars);
        return "cars";
    }
}
