import java.util.ArrayList;

class MyStringList {
    int capacity = 10;
    int length = 0;
    int[] arr = new int[capacity];

    void add(int newValue) {
        if (length == capacity) {
            // full
            capacity *= 2;
            int[] temp = new int[capacity];
            // copy original values
            for (int i = 0; i < length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[length] = newValue;
        length++;
    }
}

public class Main {
    public static void main(String[] args) {
        String[] cars1 = { "Volvo", "BMW", "Ford", "Mazda" };
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.get(1));
        System.out.println(cars1[1]);

        cars1[4] = "ABC";

        // for (int i = 0; i < 4; i++) {
        // System.out.println(cars1[i]);
        // }
    }
}