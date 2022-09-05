import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("Enter the size of your group and press [ENTER]: ");
        int groupSize = Integer.parseInt(sc.next());
        System.out.println("group size: " + groupSize);

        for (int x = 0; x < groupSize; x++) {
            System.out.printf("Please enter the name of the student #%s and press [ENTER]: ", x + 1);
            students.add(new Student(String.valueOf(sc.next()), Presence.Unknown));
        }

        for (Student s : students)
            System.out.println(String.format("Student #%s: %s", students.indexOf(s) + 1, s.name));

        for (Student st : students) {
            System.out.printf("Is student #%s(%s) present? [Y/N + ENTER]: ", students.indexOf(st) + 1, st.name);
            st.presence = Objects.equals(sc.next(), "y") ? Presence.Present : Presence.Absent;
        }

        for(Student student : students)
            System.out.printf("Student #%s: %s\t| Present: %s\n", students.indexOf(student), student.name, student.presence);
    }
}
