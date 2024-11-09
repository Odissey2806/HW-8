import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        // Массивы. Урок 2
        System.out.println("Массивы. Урок 2");

        System.out.println("Задание №1");
        int[] monthlyPayments = {35, 47, 68, 79, 41};
        int amountPaymentsMonth = 0;
        for (int i = 0; i < monthlyPayments.length; i++) {
            amountPaymentsMonth += monthlyPayments[i];
        }
        System.out.println("«Сумма трат за месяц составила " + amountPaymentsMonth + " рублей»");

        System.out.println("Задание №2");
        int[] monthlyPayments2 = {35, 47, 68, 79, 41};
        int minExpensesWeek = monthlyPayments2 [0];
        int maxSpendingWeek = monthlyPayments2 [0];
        for (int i = 0; i < monthlyPayments2.length; i++) {
            if (monthlyPayments2[i] > maxSpendingWeek) {
                maxSpendingWeek = monthlyPayments2[i];
            }
            if (monthlyPayments2[i] < minExpensesWeek) {
                minExpensesWeek = monthlyPayments2[i];
            }
        }
        System.out.println("«Минимальная сумма трат за неделю составила " + minExpensesWeek + " рублей. Максимальная сумма трат за неделю составила " + maxSpendingWeek + " рублей».");

        System.out.println("Задание №3");
        int[] monthlyPayments3 = {35, 47, 68, 79, 41};
        int amountPaymentsMonth3 = 0;
        for (int payment  : monthlyPayments3) {
            amountPaymentsMonth3 += payment;
        }
        double averagePaymentsMonth3 = (double) amountPaymentsMonth3 / monthlyPayments3.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", averagePaymentsMonth3);

        System.out.println("Задание №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}