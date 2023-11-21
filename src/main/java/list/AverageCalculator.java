package list;

import java.util.List;

public class AverageCalculator {
    public static String compareAverages(List<Double> list1, List<Double> list2) {
        if (list1 == null || list1.isEmpty() || list2 == null || list2.isEmpty()) {
            return "Lists are empty or null";
        }

        double average1 = calculateAverage(list1);
        double average2 = calculateAverage(list2);

        if (average1 > average2) {
            return "The first list has a higher average value";
        } else if (average1 < average2) {
            return "The second list has a higher average value";
        } else {
            return "Averages are equal";
        }
    }

    public static double calculateAverage(List<Double> list) {
        if (list == null || list.isEmpty()) {
            return Double.NaN;
        }

        double sum = 0;
        for (double num : list) {
            sum += num;
        }
        return sum / list.size();
    }
}

