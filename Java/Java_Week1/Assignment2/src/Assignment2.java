import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        System.out.print("Enter a course name: ");
        String course = String.valueOf(sc.nextLine());

        System.out.print("Enter number of students: ");
        int numStudents = Integer.parseInt(sc.nextLine());

        String[] studentNames = new String[numStudents];
        for (int x = 0; x < numStudents; x++){
            System.out.print("Enter name of student " + (x+1) + ":");
            studentNames[x] = String.valueOf(sc.nextLine()); }

        int[] studentGrades = new int[numStudents];
        for(int y = 0; y < numStudents; y++) {
            System.out.print("Enter grade of " + studentNames[y] + ":");
            studentGrades[y] = Integer.parseInt(sc.nextLine()); }

        System.out.println("Average grade: " + df.format(Arrays.stream(studentGrades).average().getAsDouble()));

        int index = 0;
        for(int i = 0; i < studentGrades.length;i++)
            index = studentGrades[i] > studentGrades[index] ? i : index;
        System.out.println("Student " + studentNames[index] + " has a maximum grade: " + Arrays.stream(studentGrades).max().getAsInt());

        for(int z = 0; z < numStudents; z++)
            System.out.println("Grade for student " + studentNames[z] + " (course " + course + "): " + studentGrades[z]);
    }
}
