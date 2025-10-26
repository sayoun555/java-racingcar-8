package racingcar.view;

import racingcar.domain.CarDomain;
import racingcar.domain.Cars;

import java.util.List;

public class OutputView {
    private final String WIN_MESSAGE = "최종 우승자 : ";

    public void roundCarsView(Cars cars) {
        for (int i = 0; i < cars.getCarDomain().size(); i++) {
            CarDomain car = cars.getCarDomain().get(i);
            System.out.println(car.carName() + " : " + "-".repeat(+car.carPosition()));
        }
    }

    public void resultView(List<String> car) {
        System.out.println(WIN_MESSAGE + String.join(",", car));
    }
}
