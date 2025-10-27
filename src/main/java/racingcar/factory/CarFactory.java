package racingcar.factory;

import racingcar.domain.Car;
import racingcar.domain.CarName;
import racingcar.domain.Cars;

import java.util.List;

public class CarFactory {
    public Cars carCreative(List<String> names) {
        List<Car> cars = names.stream()
                .map(name -> new Car(new CarName(name)))
                .toList();
        return new Cars(cars);
    }
}