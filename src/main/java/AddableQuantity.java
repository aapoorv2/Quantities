public class AddableQuantity extends Quantity {
    private double value;
    private Unit unit;
    AddableQuantity(double value, Unit unit) {
        super(value, unit);
        if (value < 0) {
            throw new RuntimeException();
        }
        this.value = value;
        this.unit = unit;
    }
    AddableQuantity add(AddableQuantity addableQuantity2) {
        double val1 = unit.convertToBase(value);
        val1 = addableQuantity2.unit.convertFromBase(val1);
        return new AddableQuantity(val1 + addableQuantity2.value, addableQuantity2.unit);
    }
    AddableQuantity subtract(AddableQuantity addableQuantity2) {
        double val1 = unit.convertToBase(value);
        val1 = addableQuantity2.unit.convertFromBase(val1);
        return new AddableQuantity(val1 - addableQuantity2.value, addableQuantity2.unit);
    }
}
