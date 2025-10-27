package racingcar;

import racingcar.config.AppConfig;
import racingcar.controller.RacingcarController;
import racingcar.factory.CarFactory;
import racingcar.service.RacingcarService;
import racingcar.service.RacingcarServiceImpl;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        RacingcarController racingcarController = appConfig.racingcarController();
        racingcarController.run();
    }
}