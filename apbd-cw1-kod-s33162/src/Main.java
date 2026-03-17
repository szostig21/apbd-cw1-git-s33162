import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe elementow w tablicy: ");
        int size = Integer.parseInt(sc.nextLine());

        int[] array = new int[size];

        System.out.println("Podaj " + size + " liczb calkowitych: ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(sc.nextLine());
        }

        int avg = StatisticsHelper.average(array);
        int min = StatisticsHelper.minInt(array);
        int max = StatisticsHelper.maxInt(array);

        System.out.println("Srednia: " + avg + "\nNajmniejsza liczba: " + min
                + "\nNajwieksza liczba: " + max);
        System.out.println("GitCheck");
    }
}