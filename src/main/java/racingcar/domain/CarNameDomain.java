package racingcar.domain;

public class CarNameDomain {
    private final String name;

    public CarNameDomain(String name) {
        if (name.length() < 5) {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
