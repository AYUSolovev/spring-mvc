package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    @Transactional
    public void add() {
        carDao.add();
    }

    @Override
    @Transactional
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
