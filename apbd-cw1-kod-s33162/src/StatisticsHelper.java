public class StatisticsHelper {
    public static int average(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int CalculateAverage(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum / values.length;
    }

    public static int minInt(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int CalculateMin(int[] arr) {
        int x = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < x) {
                x = arr[i];
            }
        }
        return x;
    }

    public static int maxInt(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int CalculateMax(int[] values) {
        int max = values[0];
        for (int v : values) if (v > max) max = v;
        return max;
    }
}
