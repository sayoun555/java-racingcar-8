package racingcar.factory;

import racingcar.domain.Car;
import racingcar.domain.CarName;
import racingcar.domain.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {
    public Cars carCreative(List<String> inputName) {
        List<Car> carDomains = new ArrayList<>();
        for (String name : inputName) {
            CarName carName = new CarName(name);
            Car carDomain = new Car(carName);
            carDomains.add(carDomain);
        }
        return new Cars(carDomains);
    }
}