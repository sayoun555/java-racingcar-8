package racingcar.controller;

import racingcar.domain.CarMoveCount;
import racingcar.domain.Cars;
import racingcar.domain.RacingGame;
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

    private void racingResult(RacingGame result) {
        for (int i = 0; i < result.getMoveCount(); i++) {
            result.playRound();
            outputView.roundCarsView(result.getCars());
            outputView.emptyLine();
        }
    }

    public void run() {
        List<String> name = inputView.nameInput();
        int number = Integer.parseInt(inputView.numberInput());
        RacingGame game = racingcarService.raceStarts(name, number);
        outputView.startMessage();
        racingResult(game);
        outputView.resultView(game.getCars().victoryCar());
    }
}