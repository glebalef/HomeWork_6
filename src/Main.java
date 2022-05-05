import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();

        // Задача 1

        int monthSum = 0;
        for (int i = 0; i < arr.length; i++) {
            monthSum = monthSum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + monthSum + " рублей");

        // Задача 2

        int minAmount =200001;
        int maxAmount =-1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxAmount) {
                maxAmount = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила "+maxAmount+" рублей");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minAmount) {
                minAmount = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила "+minAmount+" рублей");

        // Задача 3

        double average = 0;
        average = monthSum / arr.length;

        System.out.println("Средняя сумма трат за месяц составитла "+average+" рублей");

        // Задача 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }
    }
