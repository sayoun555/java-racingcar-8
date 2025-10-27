package racingcar.service;

import racingcar.domain.Cars;
import racingcar.factory.CarFactory;

import java.util.List;

public class RacingcarServiceImpl implements RacingcarService {
    private final CarFactory carFactory;

    public RacingcarServiceImpl(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public Cars raceStarts(List<String> inputName, int number) {
        Cars cars = carFactory.carCreative(inputName);
        for (int i = 0; i < number; i++) {
            cars.moveAll();
        }
        return cars;
    }
}