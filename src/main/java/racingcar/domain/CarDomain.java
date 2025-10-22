package racingcar.domain;

public class CarDomain {
    private final CarNameDomain carNameDomain;
    private final CarLocation carLocation;
    private final RandomNumber randomNumber;

    public CarDomain(CarNameDomain carNameDomain) {
        this.carNameDomain = carNameDomain;
        this.randomNumber = new RandomNumber();
        this.carLocation = new CarLocation();
    }

    public void carGo() {
        int carGoNumber = randomNumber.moveNumber();
        if (carGoNumber >= 4) {
            carLocation.move();
        }
    }

    public int carPosition() {
        return carLocation.getPosition();
    }

    public String carName() {
        return carNameDomain.getName();
    }
}
