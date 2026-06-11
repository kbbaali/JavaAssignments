
import java.util.Scanner;

public class kamal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = input.nextLine();

        System.out.print("Enter grade: ");
        double grade = input.nextDouble();

        System.out.println("\nStudent: " + name);

        if (grade >= 90) {
            System.out.println("Letter Grade: A");
        } else if (grade >= 80) {
            System.out.println("Letter Grade: B");
        } else if (grade >= 70) {
            System.out.println("Letter Grade: C");
        } else if (grade >= 60) {
            System.out.println("Letter Grade: D");
        } else {
            System.out.println("Letter Grade: F");
        }

        input.close();
    }
}