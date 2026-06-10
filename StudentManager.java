package CodeAlpha_StudentGradeTracker;

import java.util.ArrayList;

public class StudentManager {

	private ArrayList<Student> studentlist = new ArrayList<>();

	public void addStudent(Student student) {

		studentlist.add(student);
	}

	public void displayStudents() {

		System.out.println("\n----- STUDENTS -----");

		for (Student s : studentlist) {

			System.out.println("Name: " + s.getName() + " | Marks: " + s.getMarks() + " | Grade: " + s.getGrade());
		}
	}

	public double getAverage() {

		double total = 0;

		for (Student s : studentlist) {

			total += s.getMarks();
		}

		return total / studentlist.size();
	}

	public double getHighest() {

		double highest = studentlist.get(0).getMarks();

		for (Student s : studentlist) {

			if (s.getMarks() > highest) {

				highest = s.getMarks();
			}
		}

		return highest;
	}

	public double getLowest() {

		double lowest = studentlist.get(0).getMarks();

		for (Student s : studentlist) {

			if (s.getMarks() < lowest) {

				lowest = s.getMarks();
			}
		}

		return lowest;
	}

	public void searchStudent(String name) {

		boolean found = false;

		for (Student s : studentlist) {

			if (s.getName().equalsIgnoreCase(name)) {

				System.out.println("Found: " + s.getName() + " Marks: " + s.getMarks());

				found = true;
			}
		}

		if (!found) {

			System.out.println("Student Not Found");
		}
	}

	public boolean isEmpty() {

		return studentlist.isEmpty();
	}
}
