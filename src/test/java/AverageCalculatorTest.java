import list.AverageCalculator;

import list.Main;
import org.junit.jupiter.api.Test;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AverageCalculatorTest {
    @Test
    public void testCompareAverages_FirstListGreater() {
        assertEquals("The second list has a higher average value",
                AverageCalculator.compareAverages(Arrays.asList(1.0, 2.0, 3.0),
                        Arrays.asList(4.0, 5.0, 6.0)));

    }

    @Test
    public void testCompareAverages_SecondListGreater() {
        assertEquals("The second list has a higher average value",
                AverageCalculator.compareAverages(Arrays.asList(1.0, 2.0),
                        Arrays.asList(4.0, 5.0, 6.0)));
    }

    @Test
    public void testCompareAverages_EqualAverages() {
        assertEquals("Averages are equal",
                AverageCalculator.compareAverages(Arrays.asList(1.0, 2.0, 3.0),
                        Arrays.asList(1.0, 2.0, 3.0)));
    }

    @Test
    public void testCompareAverages_EmptyList() {
        assertEquals("Lists are empty or null",
                AverageCalculator.compareAverages(Arrays.asList(1.0, 2.0, 3.0), Collections.emptyList()));
    }

    @Test
    public void testCompareAverages_NullList() {
        assertEquals("Lists are empty or null",
                AverageCalculator.compareAverages(null,
                        Arrays.asList(4.0, 5.0, 6.0)));
    }

    @Test
    public void testCompareAverages_FirstListEmpty() {
        assertNotEquals("Averages are equal", Main.compareAverages(Arrays.asList(1.0, 2.0, 3.0),
                Arrays.asList(4.0, 5.0, 6.0)));
    }

    @Test
    public void testCompareAverages_SecondListEmpty() {
        assertEquals("Lists are empty or null",
                AverageCalculator.compareAverages(Arrays.asList(),
                        Arrays.asList()));
    }

    @Test
    public void testCompareAverages_BothListsEmpty() {
        assertEquals("Lists are empty or null",
                AverageCalculator.compareAverages(Arrays.asList(),
                        Arrays.asList()));
    }

    @Test
    public void testCalculateAverage_ListWithNegativeValues() {
        List<Double> list = Arrays.asList(-1.0, -2.0, -3.0);
        assertEquals(-2.0, AverageCalculator.calculateAverage(list));
    }

    @Test
    public void testCalculateAverage_NullList() {
        assertEquals(Double.NaN, AverageCalculator.calculateAverage(null));
    }

    @Test
    public void testCalculateAverage_EmptyList() {
        List<Double> emptyList = Collections.emptyList();
        assertEquals(Double.NaN, AverageCalculator.calculateAverage(emptyList));
    }
}
