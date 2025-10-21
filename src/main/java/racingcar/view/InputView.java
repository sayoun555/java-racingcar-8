package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private final String INPUT = "경주할 자동차 이름을 입력하세요.";

    public String nameInput () {
        System.out.println(INPUT);
        return Console.readLine();
    }

    public String numberInput() {
        return Console.readLine();
    }
}
