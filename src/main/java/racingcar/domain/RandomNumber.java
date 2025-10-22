package racingcar.domain;

import java.util.Random;

public class RandomNumber {
    private final Random random = new Random();

    public int moveNumber() {
        return random.nextInt(10);
    }
}
