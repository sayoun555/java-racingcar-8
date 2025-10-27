package racingcar;

import racingcar.controller.RacingcarController;
import racingcar.factory.CarFactory;
import racingcar.service.RacingcarService;
import racingcar.service.RacingcarServiceImpl;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        CarFactory carFactory = new CarFactory();
        RacingcarService racingcarService = new RacingcarServiceImpl(carFactory);
        RacingcarController racingcarController = new RacingcarController(racingcarService, inputView, outputView);
        racingcarController.run();
    }
}