package volume;


import length.Length;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    @DisplayName("Non negative volume is invalid and should throw an exception")
    void positive_length() {
        assertThrows(RuntimeException.class, () -> {
            Volume volume = new Volume(-1, Unit.CUBIC_CM);
        });
    }
    @Test
    @DisplayName("Compare 1000 cubic mm with 1 cubic cm")
    void compare1() {
        Volume volume1 = new Volume(1000, Unit.CUBIC_MM);
        Volume volume2 = new Volume(1, Unit.CUBIC_CM);

        assertEquals(volume1, volume2);
    }
    @Test
    @DisplayName("Compare 100 cubic mm with 1 cubic cm")
    void compare2() {
        Volume volume1 = new Volume(100, Unit.CUBIC_MM);
        Volume volume2 = new Volume(1, Unit.CUBIC_CM);

        assertNotEquals(volume1, volume2);
    }
    @Test
    @DisplayName("Add 1 cubic m to 1000 cubic cm")
    void add1() {
        Volume volume1 = new Volume(1, Unit.CUBIC_M);
        Volume volume2 = new Volume(1000, Unit.CUBIC_CM);
        Volume expected = new Volume(1001000, Unit.CUBIC_CM);
        assertEquals(expected, volume1.add(volume2));
    }
    @Test
    @DisplayName("Subtract 10000 cubic mm from 1 cubic m")
    void sub1() {
        Volume volume1 = new Volume(1, Unit.CUBIC_M);
        Volume volume2 = new Volume(10000, Unit.CUBIC_MM);
        Volume expected = new Volume(999990000, Unit.CUBIC_MM);
        assertEquals(expected, volume1.subtract(volume2));
    }

}