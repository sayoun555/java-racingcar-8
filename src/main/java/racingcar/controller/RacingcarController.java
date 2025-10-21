package racingcar.controller;

import racingcar.service.RacingcarService;
import racingcar.service.RacingcarServiceImpl;
import racingcar.view.InputView;
import racingcar.view.OutputView;

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
        String nameInput = inputView.nameInput();
        String nuberInput = inputView.numberInput();
        String result = racingcarService();
        outputView.resultView();
    }
}
