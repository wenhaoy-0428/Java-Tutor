import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);

        // int value1 = scan.nextInt();

        Box box = new Box(10, 10);
        // closure
        System.out.println(box.height_);
    }
}

class Box {
    int height_;
    int width_;

    Box(int height, int width) {
        height_ = height;
        width_ = width;
    }
}
