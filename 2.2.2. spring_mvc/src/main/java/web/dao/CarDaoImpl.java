package web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void add() {
        sessionFactory.getCurrentSession().save(new Car("model1", 1, 111));
        sessionFactory.getCurrentSession().save(new Car("model2", 2, 122));
        sessionFactory.getCurrentSession().save(new Car("model3", 3, 133));
        sessionFactory.getCurrentSession().save(new Car("model4", 4, 144));
        sessionFactory.getCurrentSession().save(new Car("model5", 5, 155));
    }

    @Override
    public List<Car> getCars(int count) {
        return sessionFactory.getCurrentSession().createQuery("from Car").setMaxResults(count).getResultList();
    }
}
