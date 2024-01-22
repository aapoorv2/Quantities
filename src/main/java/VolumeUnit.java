public enum VolumeUnit implements Unit{
    CUBIC_MM(1),
    CUBIC_CM(1000),
    CUBIC_M(1_000_000_000);
    private final int fact;
    VolumeUnit(int fact) {
        this.fact = fact;
    }
    public double convertToBase(double val) {
        return val * fact;
    }

    public double convertFromBase(double val) {
        return val / fact;
    }
}
