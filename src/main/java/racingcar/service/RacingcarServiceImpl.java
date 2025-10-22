package racingcar.service;

import racingcar.domain.CarLocation;
import racingcar.domain.CarNameDomain;

public class RacingcarServiceImpl implements  RacingcarService{
    private final CarLocation carLocation;
    private final CarNameDomain carNameDomain;

    public RacingcarServiceImpl() {
        this.carLocation = new CarLocation();
        this.carNameDomain = new CarNameDomain();
    }

}
