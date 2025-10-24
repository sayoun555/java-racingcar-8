package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    private final String INPUT = "경주할 자동차 이름을 입력하세요.";
    private final String MOVECOUNT = "시도할 횟수는 몇 회인가요?";

    public List<String> nameInput () {
        System.out.println(INPUT);
        String input = Console.readLine();
        return List.of(input.split(","));
    }

    public String numberInput() {
        System.out.println(MOVECOUNT);
        return Console.readLine();
    }
}
