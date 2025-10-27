package racingcar.config;

import racingcar.controller.RacingcarController;
import racingcar.factory.CarFactory;
import racingcar.service.RacingcarService;
import racingcar.service.RacingcarServiceImpl;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class AppConfig {
    private final InputView inputView;
    private final OutputView outputView;
    private final RacingcarService racingcarService;

    public AppConfig() {
        CarFactory carFactory = new CarFactory();
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.racingcarService = new RacingcarServiceImpl(carFactory);
    }

    public RacingcarController racingcarController() {
        return new RacingcarController(racingcarService, inputView, outputView);
    }
}
