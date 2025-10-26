package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

public class OutputView {
    private final String WIN_MESSAGE = "최종 우승자 : ";

    public void roundCarsView(Cars cars) {
        for (int i = 0; i < cars.getCar().size(); i++) {
            Car car = cars.getCar().get(i);
            System.out.println(car.carName() + " : " + "-".repeat(+car.getPosition()));
        }
    }

    public void resultView(List<String> car) {
        System.out.println(WIN_MESSAGE + String.join(",", car));
    }
}
