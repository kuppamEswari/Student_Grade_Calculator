import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
		if(numSubjects<=35){
        int[] marks = new int[numSubjects];
        int totalMarks = 0;

        // Input marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        // Step 2: Calculate Average Percentage
        double average = (double) totalMarks / numSubjects;

        // Step 3: Grade Calculation
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Step 4: Display Results
        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
	
	else{
		System.out.println("better luck next time");
	}
	}
}