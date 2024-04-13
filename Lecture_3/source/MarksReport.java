public class MarksReport {
    private void number_of_students(Student[] students) {
        int length = students.length;
        System.out.println(String.format("There are %d students.", length));
    }

    private void average_mark(Student[] students) {
        int totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.mark();
        }

        double average = (double) totalMarks / students.length;
        // System.out.println(String.format("The average mark is %.f", average));
        System.out.println("The average mark is " + average + ".");
    }

    private void best_student(Student[] students) {
        int highestMark = Integer.MIN_VALUE;
        String bestStudentName = "";

        for (Student student : students) {
            int mark = student.mark();
            if (mark > highestMark) {
                highestMark = mark;
                bestStudentName = student.name();
            }
        }
        System.out.printf("The best student is %s with a mark of %d.%n", bestStudentName, highestMark);

    }

    private void worst_student(Student[] students) {

        int lowestMark = Integer.MAX_VALUE;
        String worstStudentName = "";

        for (Student student : students) {
            int mark = student.mark();
            if (mark < lowestMark) {
                lowestMark = mark;
                worstStudentName = student.name();
            }
        }

        System.out.printf("The worst student is %s with a mark of %d.%n", worstStudentName, lowestMark);
    }

    public static void main(String[] args) {
        StudentDatabase database = new StudentDatabase(args[0]);
        // instantiate report
        MarksReport report = new MarksReport();
        // get data
        Student[] students = database.getStudents();

        // 1
        report.number_of_students(students);
        // 2
        report.average_mark(students);
        // 3
        report.best_student(students);
        // 4
        report.worst_student(students);

    }

}