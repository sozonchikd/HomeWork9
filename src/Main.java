import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //Методы часть 2
        //Общая сумма.
        System.out.println("Задание 1");
        int[] monthMoney = {101000, 134000, 152000, 187000, 121000, 155600, 173242, 135400, 198700, 200000, 190456, 100400, 177899, 163111, 175300, 183567, 112500, 133789, 144100, 171260, 182130, 147900, 100700, 112375, 147800, 136548, 131731, 192400, 177341, 194300};
        int sum = 0;
        for (int i = 0; i < monthMoney.length; i++) {
            sum += monthMoney[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int sum2 = Arrays.stream(monthMoney).sum();
        System.out.println("Сумма трат за месяц составила " + sum2 + " рублей");

//Найти максимальное и минимальное.
        System.out.println("Задание 2");
        int min = 200001;
        int max = 0;
        for (int i = 0; i < monthMoney.length; i++) {
            if (monthMoney[i] > max) {
                max = monthMoney[i];
            }
            if (monthMoney[i] < min) {
                min = monthMoney[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");

        System.out.println("Задание 3");
        float average = (float) sum / monthMoney.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");

        System.out.println("Задание4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}