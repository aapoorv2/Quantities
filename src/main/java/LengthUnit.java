

public enum LengthUnit implements Unit{
    MM(1),
    CM(10),
    M(1000),
    KM(1_000_000);
    private final int fact;
    LengthUnit(int fact) {
        this.fact = fact;
    }
    public double convertToBase(double val) {
        return val * fact;
    }

    public double convertFromBase(double val) {
        return val / fact;
    }
}
