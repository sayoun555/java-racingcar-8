package racingcar.controller;

import racingcar.domain.CarMoveCount;
import racingcar.domain.Cars;
import racingcar.service.RacingcarService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.List;

public class RacingcarController {
    private final RacingcarService racingcarService;
    private final InputView inputView;
    private final OutputView outputView;

    public RacingcarController(RacingcarService racingcarService, InputView inputView, OutputView outputView) {
        this.racingcarService = racingcarService;
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        List<String> name = inputView.nameInput();
        int number = Integer.parseInt(inputView.numberInput());
        CarMoveCount carMoveCount = new CarMoveCount(number);
        Cars result = racingcarService.Racingcar(name, carMoveCount.getMoveCount());
        outputView.roundCarsView(result);
        outputView.resultView(result.findwin());
    }
}