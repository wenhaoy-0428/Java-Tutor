import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        // Create a scanner that listens to the system input stream through Scanner
        // constructor.
        Scanner sc = new Scanner(System.in);
        float sum_mark = 0.0f;
        float best_mark = 0.0f;
        float worst_mark = 1000.0f;
        String best_student = " ";
        String worst_student = " ";

        System.out.print("How many students are there? ");
        int n = sc.nextInt();
        // to consume the \n
        sc.nextLine();
        for (int idx = 1; idx <= n; idx++) {
            System.out.print("Enter name of student " + idx + ": ");
            String name = sc.nextLine();
            // String name = sc.next();

            System.out.print("Enter mark " + idx + ": ");
            float mark = sc.nextFloat();
            // to consume the \n
            sc.nextLine();

            sum_mark = sum_mark + mark;
            if (mark > best_mark) {
                best_mark = mark;
                best_student = name;
            }
            if (mark < worst_mark) {
                worst_mark = mark;
                worst_student = name;
            }

        }
        sc.close();

        System.out.println("The average mark is: " + (sum_mark) / n);
        System.out.println("The best student is " + best_student);
        System.out.println("The worst student is " + worst_student);
    }
}

// https://stackoverflow.com/questions/23450524/java-scanner-doesnt-wait-for-user-input