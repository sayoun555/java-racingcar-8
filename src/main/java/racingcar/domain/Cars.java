package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> car;

    public Cars(List<Car> carDomainList) {
        this.car = carDomainList;
    }

    public void moveAll() {
        for (Car car : car) {
            car.move();
        }
    }

    public List<String> victoryCar() {
        int bigCar = 0;
        List<String> carName = new ArrayList<>();
        for (Car car : car) {
            int carsPosition = car.getPosition();
            if (bigCar < carsPosition) {
                bigCar = carsPosition;
            }
        }
        for (Car carBigNumber : car) {
            if (carBigNumber.getPosition() == bigCar) {
                carName.add(carBigNumber.carName());
            }
        }
        return carName;
    }

    public List<Car> getCar() {
        return car;
    }
}