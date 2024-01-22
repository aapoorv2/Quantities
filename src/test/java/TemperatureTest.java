import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    @DisplayName("Compare 30 C with 40 K")
    void compare1() {
        Temperature temp1 = new Temperature(30, TemperatureUnit.C);
        Temperature temp2 = new Temperature(303.15, TemperatureUnit.K);

        assertEquals(temp1, temp2);
    }
    @Test
    @DisplayName("Compare 0 K with -273.15 C")
    void compare2() {
        Temperature temp1 = new Temperature(0, TemperatureUnit.K);
        Temperature temp2 = new Temperature(-273.15, TemperatureUnit.C);

        assertEquals(temp1, temp2);
    }
    @Test
    @DisplayName("Compare 30 C with 86 F")
    void compare3() {
        Temperature temp1 = new Temperature(30, TemperatureUnit.C);
        Temperature temp2 = new Temperature(86, TemperatureUnit.F);

        assertEquals(temp1, temp2);
    }
    @Test
    @DisplayName("Compare 89 F with 304.817 K")
    void compare4() {
        Temperature temp1 = new Temperature(89, TemperatureUnit.F);
        Temperature temp2 = new Temperature(304.817, TemperatureUnit.K);

        assertEquals(temp1, temp2);
    }
}