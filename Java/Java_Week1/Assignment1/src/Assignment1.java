import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = String.valueOf(sc.next());
        int age = Integer.parseInt(sc.next());
        System.out.println(name + "" + age);
    }
}
