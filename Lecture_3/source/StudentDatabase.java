import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.stream.Collectors;
import java.util.List;

public class StudentDatabase {

    private Student[] students;

    public StudentDatabase(String filename) {
        this.students = StudentDatabase.readStudentsFromFile(filename);
    }

    // You don't need to understand this code, it reads the data in from a file.
    // By the end of the subject you will though.
    public static Student[] readStudentsFromFile(String filename) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {

            List<String> rawData = reader.lines().collect(Collectors.toList());
            Student[] students = new Student[rawData.size()];

            for (int i = 0; i < students.length; ++i) {
                String[] splitData = rawData.get(i).split(" ");
                students[i] = new Student(splitData[0].trim(), Integer.parseInt(splitData[1]));
            }

            return students;
        } catch (FileNotFoundException e) {
            System.err.println("The input file does not exist.");
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println("Something went wrong trying to read the file.");
            System.err.println(e.getMessage());
        }

        return null;
    }

    public Student[] getStudents() {
        return students;
    }

}