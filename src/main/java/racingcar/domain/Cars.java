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

    public int isSamePosition() {
        int bigCar = 0;
        for (Car car : car) {
            int carsPosition = car.getPosition();
            if (bigCar < carsPosition) {
                bigCar = carsPosition;
            }
        }
        return bigCar;
    }

    public List<String> victoryCar(int bigCar) {
        List<String> carName = new ArrayList<>();
        for (Car carBigNumber : car) {
            if (carBigNumber.getPosition() == bigCar) {
                carName.add(carBigNumber.carName());
            }
        }
        return carName;
    }

    public List<String> findwin() {
        int maxPosition = isSamePosition();
        return victoryCar(maxPosition);
    }

    public List<Car> getCar() {
        return car;
    }
}