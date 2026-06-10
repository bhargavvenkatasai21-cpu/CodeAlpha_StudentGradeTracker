package CodeAlpha_StudentGradeTracker;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StudentManager manager = new StudentManager();

		while (true) {

			System.out.println("\n===== STUDENT GRADE TRACKER =====");

			System.out.println("1. Add Student");

			System.out.println("2. View Students");

			System.out.println("3. Search Student");

			System.out.println("4. View Report");

			System.out.println("5. Exit");

			System.out.print("Enter Choice: ");

			int choice = sc.nextInt();

			sc.nextLine();

			switch (choice) {

			case 1:

				System.out.print("Enter Name: ");

				String name = sc.nextLine();

				System.out.print("Enter Marks: ");

				double marks = sc.nextDouble();

				manager.addStudent(new Student(name, marks));

				System.out.println("Student Added!");

				break;

			case 2:

				manager.displayStudents();
				break;

			case 3:

				System.out.print("Enter Student Name: ");

				String searchName = sc.nextLine();

				manager.searchStudent(searchName);

				break;

			case 4:

				if (manager.isEmpty()) {

					System.out.println("No Records Found");

					break;
				}

				System.out.println("\n===== REPORT =====");

				manager.displayStudents();

				System.out.println("\nAverage Marks: " + manager.getAverage());

				System.out.println("Highest Marks: " + manager.getHighest());

				System.out.println("Lowest Marks: " + manager.getLowest());

				break;

			case 5:

				System.out.println("Thank You!");

				System.exit(0);

			default:

				System.out.println("Invalid Choice");
			}
		}
	}
}
