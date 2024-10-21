package br.dev.alan.webservice;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/carros")

public class CarController {
    private final CarManager carrosManager;

    public CarController(){
        this.carrosManager = new CarManager();
    }

    @GetMapping
    public List<Car> listarCarros(){
        return carrosManager.getCarros();
    }
}
