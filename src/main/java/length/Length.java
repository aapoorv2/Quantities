package length;

public class Length {
    private double value;
    private Unit unit;
    Length(double value, Unit unit) {
        if (value < 0) {
            throw new RuntimeException();
        }

        this.unit = unit;
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Length)) {
            return false;
        }
        Length length2 = (Length) o;
        double val1 = unit.convertToMM(value);
        double val2 = length2.unit.convertToMM(length2.value);
        return Double.compare(val1, val2) == 0;
    }

    Length add(Length length2) {
        double val1 = unit.convertToMM(value);
        val1 = length2.unit.convertFromMM(val1);
        return new Length(val1 + length2.value, length2.unit);
    }
    Length subtract(Length length2) {
        double val1 = unit.convertToMM(value);
        val1 = length2.unit.convertFromMM(val1);
        return new Length(val1 - length2.value, length2.unit);
    }


}