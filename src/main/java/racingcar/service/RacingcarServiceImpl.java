package racingcar.service;

import racingcar.domain.CarMoveCount;
import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
import racingcar.factory.CarFactory;

import java.util.List;

public class RacingcarServiceImpl implements RacingcarService {
    private final CarFactory carFactory;

    public RacingcarServiceImpl(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    public RacingGame raceStarts(List<String> inputName, int number) {
        Cars cars = carFactory.carCreative(inputName);
        CarMoveCount carMoveCount = new CarMoveCount(number);
        return new RacingGame(cars, carMoveCount);
    }
}