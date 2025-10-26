package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;
import racingcar.domain.Cars;
import racingcar.factory.CarFactory;

import java.util.List;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 기능_테스트() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("pobi,woni", "1");
                    assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
                },
                MOVING_FORWARD, STOP
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,javaji", "1"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 잘못_된_입력값() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("", "2"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 시도_횟수_0() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,woni", "0"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    void 시도_횟수_음수() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,woni", "-12"))
                        .isInstanceOf(IllegalArgumentException.class));
    }

    @Test
    void 여러개_횟수_입력() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,youn", "1,2,8"))
                        .isInstanceOf(IllegalArgumentException.class));
    }

    @Test
    void 자동차_공장_테스트() {
        CarFactory carFactory = new CarFactory();
        Cars cars = carFactory.factory(List.of("pobi", "youn", "wo"));
        assertThat(cars).isNotNull();
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
