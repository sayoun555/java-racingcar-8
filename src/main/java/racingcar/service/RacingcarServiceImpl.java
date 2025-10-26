package racingcar.service;

import racingcar.domain.Cars;
import racingcar.factory.CarFactory;

import java.util.List;

public class RacingcarServiceImpl implements RacingcarService {

    public Cars Racingcar(List<String> inputName, int number) {
        CarFactory carFactory = new CarFactory();
        Cars cars = carFactory.carCreative(inputName);
        for (int i = 0; i < number; i++) {
            cars.moveAll();
        }
        return cars;
    }
}