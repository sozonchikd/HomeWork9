import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        //Методы часть 2
        System.out.println("Задание 1");
        int[] monthMoney = {101000, 134000, 152000, 187000, 121000, 155600, 173242, 135400, 198700, 200000, 190456, 100400, 177899, 163111, 175300, 183567, 112500, 133789, 144100, 171260, 182130, 147900, 100700, 112375, 147800, 136548, 131731, 192400, 177341, 194300};
        int sum = 0;
        for (int i = 0; i < monthMoney.length; i++) {
            sum += monthMoney[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int sum2 = Arrays.stream(monthMoney).sum();
        System.out.println("Сумма трат за месяц составила " + sum2 + " рублей");


        System.out.println("Задание 2");






    }
}