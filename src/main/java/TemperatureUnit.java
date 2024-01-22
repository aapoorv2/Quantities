public enum TemperatureUnit {
    K(1, 273.15),
    C(1),
    F(5.0 / 9.0, 32);
    private final double fact;
    private final double offset;
    TemperatureUnit(double fact) {
        this.fact = fact;
        this.offset = 0;
    }
    TemperatureUnit(double fact, double offset) {
        this.fact = fact;
        this.offset = offset;
    }
    public double convertToBase(double val) {
        return (val - offset) * fact;
    }

    public double convertFromBase(double val) {
        return val / fact + offset;
    }
}
