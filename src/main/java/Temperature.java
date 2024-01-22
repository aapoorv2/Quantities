public class Temperature {
    private double value;
    private TemperatureUnit unit;
    Temperature(double value, TemperatureUnit unit) {
        this.value = value;
        this.unit = unit;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Temperature)) {
            return false;
        }
        Temperature temp2 = (Temperature) o;
        double val1 = unit.convertToBase(value);
        double val2 = temp2.unit.convertToBase(temp2.value);
        return Double.compare(val1, val2) == 0;
    }

}
