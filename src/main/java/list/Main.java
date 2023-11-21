package list;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list1 = Arrays.asList(1.0, 2.0, 3.0);
        List<Double> list2 = Arrays.asList(4.0, 5.0, 6.0);

        String result = compareAverages(list1, list2);
        System.out.println(result);
    }

    public static String compareAverages(List<Double> list1, List<Double> list2) {
        double average1 = AverageCalculator.calculateAverage(list1);
        double average2 = AverageCalculator.calculateAverage(list2);

        if (average1 > average2) {
            return "The first list has a higher average value";
        } else if (average1 < average2) {
            return "The second list has a higher average value";
        } else {
            return "Averages are equal";
        }
    }

}

