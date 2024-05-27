import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.*;
import java.io.*;

public class Processor {

    public static <O> void mapData(String inputFilename, String outputFilename, Function<Integer, O> map) {
        try (Scanner scanner = new Scanner(new File(inputFilename));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))) {
            while (scanner.hasNextLine()) {
                try {
                    String line = scanner.nextLine();
                    int inputValue = Integer.parseInt(line);
                    O mappedValue = map.apply(inputValue);
                    writer.write(mappedValue.toString());
                    if (scanner.hasNextLine()) {
                        writer.newLine();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        mapData("inputTest.txt", "outputTest.txt", Function.<Integer>identity());
    }
}
