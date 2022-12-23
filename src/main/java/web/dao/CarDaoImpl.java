package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class CarDaoImpl implements CarDao{

    private static int CAR_ID;

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(++CAR_ID,"Name1",1990,200000,300000));
        carList.add(new Car(++CAR_ID,"Name2",1991,200001,300001));
        carList.add(new Car(++CAR_ID,"Name3",1992,200002,300002));
        carList.add(new Car(++CAR_ID,"Name4",1993,200003,300003));
        carList.add(new Car(++CAR_ID,"Name5",1994,200004,300004));
    }

    @Override
    public List<Car> index() {
        return carList;
    }

    @Override
    public Car show(int id) {
        return carList.stream().filter(car -> car.getId()==id).findAny().orElse(null);
    }



}
