package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    void add();

    List<Car> getCars(int count);
}
