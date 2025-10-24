package racingcar.view;

import racingcar.domain.CarDomain;
import racingcar.domain.Cars;

import java.util.List;

public class OutputView {

    public void roundView(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("-");
        }
    }

    public void roundCarsView(Cars cars) {
        for (int i = 0; i < cars.getCarDomain().size() ; i++) {
            CarDomain car = cars.getCarDomain().get(i);
            System.out.println(car.carName() + " : " + "-".repeat(car.carPosition()));
        }
    }

    public void resultView(List<String> car) {
        System.out.println(car);
    }
}
