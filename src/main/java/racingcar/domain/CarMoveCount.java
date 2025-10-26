package racingcar.domain;

public class CarMoveCount {
    private final int moveCount;
    private final String ERROR_MOVE_MESSAGE = "시도할 횟수가 0이거나 음수입니다.";

    public CarMoveCount(int moveCount) {
        if (moveCount <= 0) {
            throw new IllegalArgumentException(ERROR_MOVE_MESSAGE);
        }
        this.moveCount = moveCount;
    }

    public int getMoveCount() {
        return moveCount;
    }
}