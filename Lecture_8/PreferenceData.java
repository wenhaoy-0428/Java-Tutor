
// Imports the BufferedReader class for reading text from a character-input stream.
import java.io.BufferedReader;
//Imports the FileNotFoundException class to handle file not found exceptions.
import java.io.FileNotFoundException;
//Imports the FileReader class for reading files.
import java.io.FileReader;
//Imports the IOException class to handle exceptions.
import java.io.IOException;
//Imports the ArrayList class for creating dynamic arrays.
import java.util.ArrayList;
//Imports the Arrays class for array manipulation methods.
import java.util.Arrays;
//mports the List interface for working with lists.
import java.util.List;

// Defines the PreferenceData class.
public class PreferenceData {

	// Declares a list that can't be overwritten to hold Student objects.
	private final List<Student> students;
	// Declares a list that can't be overwritten to hold Project objects.
	private final List<Project> projects;
	// Declares a 2D array to store preference values between students and projects.
	private int[][] preferences;

	// Declares a global enumeration to represent the state while reading data from
	// a file.
	private static enum ReadState {
		// this is the type Of the mode
		STUDENT_MODE, PROJECT_MODE, PREFERENCE_MODE, UNKNOWN;
	};

	// Constructor for the PreferenceData class. Initializes the students and
	// projects lists.
	public PreferenceData() {
		// Useless as PreferenceData class doesn’t not inherit from other classes
		super();
		// Initialize private variable students to an empty arrayList of Student
		this.students = new ArrayList<Student>();
		// Initialize private variable projects to an empty arrayList of Project
		this.projects = new ArrayList<Project>();
	}

	public void addStudent(Student s) {

		// Adds a Student object to the list of students
		this.students.add(s);

	}

	public void addStudent(String s) {

		// Creates a Student object from a string representation By calling a static
		// function createStudents of Student
		// and adds it to the list of students.
		this.addStudent(Student.createStudent(s));

	}

	public void addProject(Project p) {

		// Adds a Project object to the list of projects.
		this.projects.add(p);
	}

	public void addProject(String p) {

		// Creates a Project object from a string representation By calling a static
		// function createProject of Project and adds it to the list of projects.
		this.addProject(Project.createProject(p));
	}

	public void createPreferenceMatrix() {
		// Initializes the preferences 2D array with number of rows equals to the number
		// of students
		// and number of col of each row equals to the number of projects
		this.preferences = new int[this.students.size()][this.projects.size()];

	}

	public void setPreference(Student s, Project p, int preference) {
		// Sets the preference value Of a project p that belongs to student s
		// by first looking up their corresponding row index and column index
		this.preferences[this.students.indexOf(s)][this.projects.indexOf(p)] = preference;

	}

	public void setPreference(int row, int column, int preference) {
		// Sets the preference value at a specific row and column in the preference
		// matrix
		this.preferences[row][column] = preference;
		// this line of code initializes a 2D array to store preferences
	}

	// This method is used to set the preference values for a specific row in the
	// preference matrix. It takes an integer row representing the row index
	// and an array of String prefValues representing the preference values for that
	// row.
	public void setPreferenceRow(int row, String[] prefValues) {
		// Write the preference value by looping through each of the preference value
		for (int j = 0; j < prefValues.length; j++) {
			// converting string to int before writing in.
			this.preferences[row][j] = Integer.parseInt(prefValues[j]);
		}
	}

	// A getter function of students
	public List<Student> getStudents() {
		return students;
	}

	// A getter function of projects
	public List<Project> getProjects() {
		return projects;
	}

	// A getter function of preference.
	public int[][] getPreferences() {
		return preferences;
	}

	// This method overrides the toString() method
	// to provide a string representation of the PreferenceData object.
	@Override
	public String toString() {
		return "PreferenceData [students=" + students + ", projects=" + projects + ", preferences="
				+ Arrays.toString(preferences) + "]";
	}

	// This static method is used to read data from an input file
	// and construct a PreferenceData object based on the contents of the file.
	// It takes the path to the input file as a parameter.
	static PreferenceData readData(String inputFile) {
		// The method initializes a new PreferenceData object named prefs, which will be
		// returned.
		PreferenceData prefs = new PreferenceData();
		// It opens a BufferedReader to read from the input file.
		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
			// It initializes a variable state of type ReadState to keep track of the
			// current state
			// while reading the file.
			ReadState state = ReadState.UNKNOWN;
			// It initializes a variable row to keep track of the current row
			// when reading preference values.
			int row = 0;
			// It reads each line from the file using a while loop
			// until there are no more lines to read.
			while (reader.ready()) {
				String line = reader.readLine();
				switch (line.trim()) {
					case "Students:":
						state = ReadState.STUDENT_MODE;
						break;
					case "Projects:":
						state = ReadState.PROJECT_MODE;
						break;
					case "Preferences:":
						prefs.createPreferenceMatrix();
						state = ReadState.PREFERENCE_MODE;
						break;
					default:
						switch (state) {
							case STUDENT_MODE:
								prefs.addStudent(line);
								break;
							case PROJECT_MODE:
								prefs.addProject(line);
								break;
							case PREFERENCE_MODE:
								prefs.setPreferenceRow(row, line.split(","));
								row++;
								break;
							default:
								throw new PreferenceFormatException(line);
						}
				}

			}

			reader.close();

		} catch (FileNotFoundException e) {
			System.err.println("Error opening preferences file. File does not exist as specified.");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error reading from file.");
			e.printStackTrace();
		} catch (PreferenceFormatException e) {
			System.err.println("Preference file in incorrect format. I can't tell which section I'm in.");
			System.err.println("Line being read: " + e.getCurrentLine());
			e.printStackTrace();
		}

		return prefs;
	}

	public int getPreference(int i, int j) {
		return this.preferences[i][j];
	}

	public int numStudents() {
		return this.students.size();
	}

	public int numProjects() {
		return this.projects.size();
	}

}