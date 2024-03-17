package Lecture_2.source;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // for (int i = 0; i < 10; i++) {
        // for (int j = 0; j < 10; i++) {
        // System.out.println(i + "-" + j);
        // // String ip = sc.next();
        // }
        // }

        int i = 10;
        // while (i < 10) {
        // System.out.println(i);
        // i++;
        // }

        // do {
        // System.out.println(i);
        // i++;
        // } while (i < 10);

        // for (int j = 0; j < 10; j++) {
        // System.out.println(j);
        // }

        String[] student = { "Bob", "Eric", "Alice" };
        for (int idx = 0; idx < student.length; idx++) {
            System.out.println("I am " + student[idx]);
            if (student[idx] == "Eric") {
                continue;
            }
            System.out.println("I got a candy");
        }
    }
}
