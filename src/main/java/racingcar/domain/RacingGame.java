package racingcar.domain;

public class RacingGame {
    private final Cars cars;
    private final CarMoveCount moveCount;

    public RacingGame(Cars cars, CarMoveCount moveCount) {
        this.cars = cars;
        this.moveCount = moveCount;
    }

    public void playRound() {
        cars.moveAll();
    }

    public int getMoveCount() {
        return moveCount.getMoveCount();
    }

    public Cars getCars() {
        return cars;
    }
}
