import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Student {
    private String name;
    private ArrayList<Assignment> assignments;


    public Student(File file) throws FileNotFoundException {
        name = file.getName().replace(".txt","");
        assignments = new ArrayList<>();

        Scanner fileReader = new Scanner(file);

        while ( fileReader.hasNext()){
            String line = fileReader.nextLine();
            // splits the line into string pieces every time it finds the character
            String[] parts = line.split("[|]");

            Assignment assignment = new Assignment(parts[0], Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
            assignments.add(assignment);
        }

    }
    public Student(String name) {
        this.name = name;
        assignments = new ArrayList<>();
    }

    public Student(String name, ArrayList<Assignment> assignments) {
        this.name = name;
        setAssignments(assignments);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // be careful giving someone a reference to a list, they can modify it
    public ArrayList<Assignment> getAssignments() {
        ArrayList<Assignment> copy = new ArrayList<>();
        Collections.copy(copy, assignments);
        return copy;
    }

    public void setAssignments(ArrayList<Assignment> assignments) {
        Collections.copy(this.assignments, assignments);
    }

    public boolean addAssignment(Assignment assignment){
        return assignments.add(assignment);
    }

    public void writeToFile() throws IOException {
        PrintWriter printWriter = new PrintWriter( new FileWriter(name + ".txt"));
        for ( Assignment assignment : assignments){
            printWriter.println(assignment.getStringForFile());
        }
        printWriter.close();

    }

    public double getGrade(){
        double totalPossiblePoints = 0;
        double totalPoints = 0;

        for ( Assignment assignment : assignments ){
            totalPossiblePoints += assignment.getMaxScore();
            totalPoints += assignment.getScore();
        }

        return totalPoints / totalPossiblePoints * 100;
    }
}
