package length;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    @DisplayName("Non negative length is invalid and should throw an exception")
    void positive_length() {
        assertThrows(RuntimeException.class, () -> {
            Length length = new Length(-1, Unit.MM);
        });
    }

    @Test
    @DisplayName("Compare 100 mm with 1 cm")
    void compare1() {
        Length length1 = new Length(100, Unit.MM);
        Length length2 = new Length(10, Unit.CM);

        assertEquals(length1, length2);
    }
    @Test
    @DisplayName("Compare 1 m with 1000 cm")
    void compare2() {
        Length length1 = new Length(1, Unit.M);
        Length length2 = new Length(1000, Unit.CM);
        assertNotEquals(length1, length2);
    }
    @Test
    @DisplayName("Add 1 m to 1000 cm")
    void add1() {
        Length length1 = new Length(1, Unit.M);
        Length length2 = new Length(1000, Unit.CM);
        Length expected = new Length(1100, Unit.CM);
        assertEquals(expected, length1.add(length2));
    }
    @Test
    @DisplayName("Add 1 mm to 2 m")
    void add2() {
        Length length1 = new Length(1, Unit.MM);
        Length length2 = new Length(2, Unit.M);
        Length expected = new Length(2.001, Unit.M);
        assertEquals(expected, length1.add(length2));
    }
    @Test
    @DisplayName("Subtract 100 cm from 1 m")
    void sub1() {
        Length length1 = new Length(1, Unit.M);
        Length length2 = new Length(100, Unit.CM);
        Length expected = new Length(0, Unit.CM);
        assertEquals(expected, length1.subtract(length2));
    }
    @Test
    @DisplayName("Subtract 1 mm from 2 m")
    void sub2() {
        Length length1 = new Length(2, Unit.M);
        Length length2 = new Length(1, Unit.MM);
        Length expected = new Length(1999, Unit.MM);
        assertEquals(expected, length1.subtract(length2));
    }

}