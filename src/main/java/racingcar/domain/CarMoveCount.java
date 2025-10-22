package racingcar.domain;

public class CarMoveCount {
    private final int moveCount;

    public CarMoveCount(int moveCount) {
        if (moveCount <= 0){
            throw new IllegalArgumentException();
        }
        this.moveCount = moveCount;
    }

    public int getMoveCount() {
        return moveCount;
    }
}