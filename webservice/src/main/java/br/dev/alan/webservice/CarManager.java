package br.dev.alan.webservice;

import java.util.*;

public class CarManager {
    private List<Car> carros;

    public CarManager(){
        this.carros = new ArrayList<>();
        this.carros.add(new Car("Uno", "Fiat"));
        this.carros.add(new Car("Astra","Chevrolet"));
        this.carros.add(new Car("Tempra", "Fiat"));
        this.carros.add(new Car("Saveiro","Volkswagen"));
        this.carros.add(new Car("Kadett", "Chevrolet"));
        this.carros.add(new Car("Civic","Honda"));
        this.carros.add(new Car("Supra", "Toyota"));
        this.carros.add(new Car("Escort","Ford"));
    }

    public List<Car> getCarros(){
        return this.carros;
    }
}
