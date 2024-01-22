package mass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MassTest {
    @Test
    @DisplayName("Non negative weight is invalid and should throw an exception")
    void positive_weight() {
        assertThrows(RuntimeException.class, () -> {
            Mass mass = new Mass(-1, Unit.MG);
        });
    }
    @Test
    @DisplayName("Compare 100 mg with 1 g")
    void compare1() {
        Mass mass1 = new Mass(100, Unit.MG);
        Mass mass2 = new Mass(10, Unit.G);

        assertNotEquals(mass1, mass2);
    }
    @Test
    @DisplayName("Compare 1 g with 1000 mg")
    void compare2() {
        Mass mass1 = new Mass(1, Unit.G);
        Mass mass2 = new Mass(1000, Unit.MG);

        assertEquals(mass1, mass2);
    }
    @Test
    @DisplayName("Add 1 g to 1000 mg")
    void add1() {
        Mass mass1 = new Mass(1, Unit.G);
        Mass mass2 = new Mass(1000, Unit.MG);
        Mass expected = new Mass(2000, Unit.MG);
        assertEquals(expected, mass1.add(mass2));
    }
    @Test
    @DisplayName("Add 1 mm to 2 m")
    void add2() {
        Mass mass1 = new Mass(5, Unit.KG);
        Mass mass2 = new Mass(2000, Unit.G);
        Mass expected = new Mass(7000, Unit.G);
        assertEquals(expected, mass1.add(mass2));
    }
    @Test
    @DisplayName("Subtract 100 cm from 1 m")
    void sub1() {
        Mass mass1 = new Mass(100, Unit.G);
        Mass mass2 = new Mass(1000, Unit.MG);
        Mass expected = new Mass(99000, Unit.MG);
        assertEquals(expected, mass1.subtract(mass2));
    }
    @Test
    @DisplayName("Subtract 2000 g from 5 kg")
    void sub2() {
        Mass mass1 = new Mass(5, Unit.KG);
        Mass mass2 = new Mass(2000, Unit.G);
        Mass expected = new Mass(3000, Unit.G);
        assertEquals(expected, mass1.subtract(mass2));
    }

}