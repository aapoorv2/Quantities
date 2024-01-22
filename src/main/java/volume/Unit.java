package volume;

public enum Unit {
    CUBIC_MM(1),
    CUBIC_CM(1000),
    CUBIC_M(1_000_000_000);
    private final int fact;
    Unit(int fact) {
        this.fact = fact;
    }
    double convertToCubicMM(double val) {
        return val * fact;
    }

    double convertFromCubicMM(double val) {
        return val / fact;
    }
}
