package sberTraining.june;

import java.util.Scanner;

public class ConvertAmount {
    /*
    1. Получить сумму денег в американских долларах
    2. Конвертировать сумму денег в российские рубли.
        2.1. roubles = ROUBLES_PER_DOLLAR * dollars;
    3. Отобразить сумму денег в российских рублях в пользу покупателя.
     */
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки
        int dollars; // сумма денег в американских долларах
        double roubles; // сумма денег в российских рублях

        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество долларов: ");

        dollars = input.nextInt();
        roubles = ROUBLES_PER_DOLLAR * dollars;

        System.out.println("Эта сумма равна " + (int)(roubles * 100) / 100 + " рублей");

    }
}
