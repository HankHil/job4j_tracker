package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int s = 11;
        while (run) {
            System.out.println("На столе " + s + " спичек. Вытяните от 1 до 4 спичек. Выигрывает тот кто вытянет последним.");
            int select = Integer.valueOf(input.nextLine());
            if (select > 4 || select > s) {
                System.out.println("Слишком много тянете");
            } else if (select < 1) {
                System.out.println("Слишком мало тянете");
            } else {
                s -= select;
                if (s > 0) {
                    System.out.println("Продолжаем");
                } else {
                    System.out.println("Вы выиграли!");
                    run = false;
                }
            }
        }
    }
}
