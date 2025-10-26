package racingcar;

import racingcar.controller.RacingcarController;
import racingcar.service.RacingcarService;
import racingcar.service.RacingcarServiceImpl;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        RacingcarService racingcarService = new RacingcarServiceImpl();
        RacingcarController racingcarController = new RacingcarController(racingcarService, inputView, outputView);
        racingcarController.run();
    }
}