package racingcar.service;

import racingcar.domain.RacingGame;

import java.util.List;

public interface RacingcarService {
    RacingGame raceStarts(List<String> inputName, int number);
}
