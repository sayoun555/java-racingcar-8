package racingcar.service;

import racingcar.domain.Cars;
import java.util.List;

public interface RacingcarService {
    Cars raceStarts(List<String> inputName, int number);
}
