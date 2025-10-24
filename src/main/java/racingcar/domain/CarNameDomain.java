package racingcar.domain;

public class CarNameDomain {
    private final String name;
    private final String ERROR_NAME_MESSAGE = "이름이 잘못 되었습니다.";

    public CarNameDomain(String name) {
        if (name.length() > 5 || name.isEmpty()) {
            throw new IllegalArgumentException(ERROR_NAME_MESSAGE);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
