package mass;

public enum Unit {
    MG(1),
    G(1000),
    KG(1000_000);
    private final int fact;
    Unit(int fact) {
        this.fact = fact;
    }
    double convertToMG(double val) {
        return val * fact;
    }

    double convertFromMG(double val) {
        return val / fact;
    }
}
