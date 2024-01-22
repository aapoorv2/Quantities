package length;

public enum Unit {
    MM(1),
    CM(10),
    M(1000),
    KM(1_000_000);
    private final int fact;
    Unit(int fact) {
        this.fact = fact;
    }
    double convertToMM(double val) {
        return val * fact;
    }

    double convertFromMM(double val) {
        return val / fact;
    }
}
