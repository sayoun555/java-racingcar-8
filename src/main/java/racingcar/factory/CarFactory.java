package racingcar.factory;

import racingcar.domain.CarDomain;
import racingcar.domain.CarNameDomain;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public Cars factory(List<String> inputName) {
        List<CarDomain> carDomains = new ArrayList<>();
        for (String name : inputName) {
            CarNameDomain carNameDomain = new CarNameDomain(name);
            CarDomain carDomain = new CarDomain(carNameDomain);
            carDomains.add(carDomain);
        }
        return new Cars(carDomains);
    }
}