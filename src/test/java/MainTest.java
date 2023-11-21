import list.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    public void testMain_SecondListGreater() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[0]);
        String expectedOutput = "The second list has a higher average value";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testMain_DifferentAverages() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Main.main(new String[]{"1.0", "2.0", "3.0", "4.0", "5.0", "6.0"});
        String expectedOutput = "The second list has a higher average value";
        assertEquals(expectedOutput, outContent.toString().trim());
    }

    @Test
    public void testCompareAverages_FirstListGreater() {
        List<Double> list1 = Arrays.asList(4.0, 5.0, 6.0);
        List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0);
        assertEquals("The first list has a higher average value", Main.compareAverages(list1, list2));
    }

    @Test
    public void testCompareAverages_SecondListGreater() {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(4.0, 5.0, 6.0);
        assertEquals("The second list has a higher average value", Main.compareAverages(list1, list2));
    }
}



