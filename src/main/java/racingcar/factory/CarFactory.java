package racingcar.factory;

import racingcar.domain.Car;
import racingcar.domain.CarNameDomain;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public Cars carCreative(List<String> inputName) {
        List<Car> carDomains = new ArrayList<>();
        for (String name : inputName) {
            CarNameDomain carNameDomain = new CarNameDomain(name);
            Car carDomain = new Car(carNameDomain);
            carDomains.add(carDomain);
        }
        return new Cars(carDomains);
    }
}