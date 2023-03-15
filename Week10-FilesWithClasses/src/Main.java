import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the name of a student");
        String studentName = keyboard.nextLine();

        File studentFile = new File(studentName + ".txt");
        Student student;

        if ( studentFile.exists() ){
            System.out.println("Student file exists, reading file");
            student = new Student(studentFile);
        } else {
            System.out.println("Creating new student file");

            student = new Student(studentName);

            String assignmentName = "";

            while (!assignmentName.equalsIgnoreCase("stop")) {

                System.out.println("Enter the name of an assignment or STOP");
                assignmentName = keyboard.nextLine();

                if (!assignmentName.equalsIgnoreCase("stop")) {
                    System.out.println("Enter the max score for " + assignmentName);
                    double maxScore = Double.parseDouble(keyboard.nextLine());

                    System.out.println("Enter " + studentName + "'s score for " + assignmentName);
                    double score = Double.parseDouble(keyboard.nextLine());

                    Assignment assignment = new Assignment(assignmentName, maxScore, score);
                    student.addAssignment(assignment);
                }

            }

            student.writeToFile();

        }

        System.out.println("Student's grade percentage: " + student.getGrade());

        System.out.println("Hello world!");
    }
}