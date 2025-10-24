package racingcar.service;

import racingcar.domain.CarDomain;
import racingcar.domain.CarNameDomain;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class RacingcarServiceImpl implements  RacingcarService{

    public Cars Racingcar(List<String> inputName, int number) {
        List<CarDomain> carNames = new ArrayList<>();
        for (String name : inputName) {
            CarNameDomain carNameDomain = new CarNameDomain(name);
            CarDomain carDomain = new CarDomain(carNameDomain);
            carNames.add(carDomain);
        }
        Cars cars = new Cars(carNames);
        for (int i = 0; i < number; i++){
            cars.moveAll();
        }
        return cars;
    }
}
