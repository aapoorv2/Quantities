public enum MassUnit implements Unit{
    MG(1),
    G(1000),
    KG(1000_000);
    private final int fact;
    MassUnit(int fact) {
        this.fact = fact;
    }
    public double convertToBase(double val) {
        return val * fact;
    }

    public double convertFromBase(double val) {
        return val / fact;
    }
}
