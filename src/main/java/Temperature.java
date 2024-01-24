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
        String formattedValue1 = String.format("%.2f", val1);
        double roundedValue1 = Double.parseDouble(formattedValue1);
        String formattedValue2 = String.format("%.2f", val2);
        double roundedValue2 = Double.parseDouble(formattedValue2);

        return Double.compare(roundedValue1, roundedValue2) == 0;
    }

}
