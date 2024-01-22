package volume;


public class Volume {
    private double value;
    private Unit unit;
    Volume(double value, Unit unit) {
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
        if (!(o instanceof Volume)) {
            return false;
        }
        Volume volume2 = (Volume) o;
        double val1 = unit.convertToCubicMM(value);
        double val2 = volume2.unit.convertToCubicMM(volume2.value);
        return Double.compare(val1, val2) == 0;
    }

    Volume add(Volume length2) {
        double val1 = unit.convertToCubicMM(value);
        val1 = length2.unit.convertFromCubicMM(val1);
        return new Volume(val1 + length2.value, length2.unit);
    }
    Volume subtract(Volume volume2) {
        double val1 = unit.convertToCubicMM(value);
        val1 = volume2.unit.convertFromCubicMM(val1);
        return new Volume(val1 - volume2.value, volume2.unit);
    }
}
