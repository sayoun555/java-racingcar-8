package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> car;

    public Cars(List<Car> carDomainList) {
        this.car = carDomainList;
    }

    private int findMaxPosition() {
        int maxPosition = 0;
        for (Car car : car) {
            int carsPosition = car.getPosition();
            if (maxPosition < carsPosition) {
                maxPosition = carsPosition;
            }
        }
        return maxPosition;
    }

    private List<String> findWinCarNames(int maxPosition) {
        List<String> carName = new ArrayList<>();
        for (Car car : car) {
            if (car.getPosition() == maxPosition) {
                carName.add(car.carName());
            }
        }
        return carName;
    }

    public List<String> victoryCar() {
        int maxPosition = findMaxPosition();
        return findWinCarNames(maxPosition);
    }

    public void moveAll() {
        for (Car car : car) {
            car.move();
        }
    }

    public List<Car> getCar() {
        return car;
    }
}