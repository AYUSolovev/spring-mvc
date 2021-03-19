package web.dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    void add();

    List<Car> getCars(int count);
}
