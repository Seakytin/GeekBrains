package homework.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        guessTheNumber();
    }

    public static void guessTheNumber() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int x;
        int a;
        int b;
        do {
            System.out.println("введите число от 0 до 9");
            x = rand.nextInt(10);
            for (int i = 0; i < 3; i++) {
                a = scan.nextInt();
                if (x > a) {
                    System.out.println("Заданное число больше вашего");
                } else if (x < a) {
                    System.out.println("Заданное число меньше вашего");
                } else if (x == a) {
                    System.out.println("Вы угадали");
                    break;
                }
            }
            System.out.println("Загаданное число было = " + x);
            System.out.println("если вы хотите повторить игру нажмите 1 если нет нажмите 0");
            b = scan.nextInt();
        } while (b == 1);
      }
    }



