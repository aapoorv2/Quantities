public class Quantity {
    private double value;
    private Unit unit;
    Quantity(double value, Unit unit) {
        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Quantity)) {
            return false;
        }

        Quantity quantity2 = (Quantity) o;
        double val1 = unit.convertToBase(value);
        double val2 = quantity2.unit.convertToBase(quantity2.value);
        String formattedValue1 = String.format("%.2f", val1);
        double roundedValue1 = Double.parseDouble(formattedValue1);
        String formattedValue2 = String.format("%.2f", val2);
        double roundedValue2 = Double.parseDouble(formattedValue2);

        return Double.compare(roundedValue1, roundedValue2) == 0;
    }

//    Quantity add(Quantity quantity2) {
//        double val1 = unit.convertToBase(value);
//        val1 = quantity2.unit.convertFromBase(val1);
//        return new Quantity(val1 + quantity2.value, quantity2.unit);
//    }
//    Quantity subtract(Quantity quantity2) {
//        double val1 = unit.convertToBase(value);
//        val1 = quantity2.unit.convertFromBase(val1);
//        return new Quantity(val1 - quantity2.value, quantity2.unit);
//    }
}
