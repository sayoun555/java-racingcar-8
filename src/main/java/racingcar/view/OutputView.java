package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

public class OutputView {
    private final String WIN_MESSAGE = "최종 우승자 : ";
    private final String START_MESSAGE = "\n실행 결과";

    public void roundCarsView(Cars cars) {
        for (Car car : cars.getCar()) {
            System.out.println(car.carName() + " : " + "-".repeat(car.getPosition()));
        }
    }

    public void startMessage() {
        System.out.println(START_MESSAGE);
    }

    public void emptyLine() {
        System.out.println();
    }


    public void resultView(List<String> car) {
        System.out.println(WIN_MESSAGE + String.join(",", car));
    }
}
