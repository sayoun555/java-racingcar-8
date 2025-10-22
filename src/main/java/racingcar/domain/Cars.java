package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<CarDomain> carDomain;

    public Cars(List<CarDomain> carDomainList) {
        this.carDomain = carDomainList;
    }

    public void moveAll() {
        for (CarDomain car : carDomain) {
            car.carGo();
        }
    }

    public List<String> vitoriCar() {
        int bigCar = 0;
        List<String> carName = new ArrayList<>();
        for (CarDomain car : carDomain) {
            int carsPosition = car.carPosition();
            if (bigCar < carsPosition) {
                bigCar = carsPosition;
            }
        }
        for (CarDomain carBigNumber : carDomain) {
            if (carBigNumber.carPosition() == bigCar) {
                carName.add(carBigNumber.carName());
            }
        }
        return carName;
    }
}
