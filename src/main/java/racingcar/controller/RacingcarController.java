package racingcar.controller;

import racingcar.domain.CarMoveCount;
import racingcar.domain.Cars;
import racingcar.service.RacingcarService;
import racingcar.service.RacingcarServiceImpl;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingcarController {
    private final RacingcarService racingcarService;
    private final InputView inputView;
    private final OutputView outputView;

    public RacingcarController (RacingcarServiceImpl racingcarService, InputView inputVeiw, OutputView outputVeiw)
    {
        this.racingcarService = racingcarService;
        this.inputView = inputVeiw;
        this.outputView = outputVeiw;
    }

    public void run() {
        int number = Integer.parseInt(inputView.numberInput());
        Cars result = racingcarService.Racingcar(inputView.nameInput(), number);
        outputView.roundCarsView(result);
        outputView.resultView(result.vitoryCar());
    }
}
