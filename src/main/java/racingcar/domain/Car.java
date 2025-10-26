package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final CarName carName;
    int position = 0;

    public Car(CarName carNameDomain) {
        this.carName = carNameDomain;
    }

    public boolean shouldMove() {
        return Randoms.pickNumberInRange(0, 9) >= 4;
    }

    public void move() {
        if (shouldMove()) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String carName() {
        return carName.getName();
    }
}