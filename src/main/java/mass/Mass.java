package mass;

public class Mass {
    private double value;
    private Unit unit;
    Mass(double value, Unit unit) {
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
        if (!(o instanceof Mass)) {
            return false;
        }
        Mass mass2 = (Mass) o;
        double val1 = unit.convertToMG(value);
        double val2 = mass2.unit.convertToMG(mass2.value);
        return Double.compare(val1, val2) == 0;
    }

    Mass add(Mass mass2) {
        double val1 = unit.convertToMG(value);
        val1 = mass2.unit.convertFromMG(val1);
        return new Mass(val1 + mass2.value, mass2.unit);
    }
    Mass subtract(Mass mass2) {
        double val1 = unit.convertToMG(value);
        val1 = mass2.unit.convertFromMG(val1);
        return new Mass(val1 - mass2.value, mass2.unit);
    }
}
