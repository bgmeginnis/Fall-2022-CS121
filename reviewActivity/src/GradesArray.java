import java.util.Scanner;
import java.util.ArrayList;

public class GradesArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("enter number of courses");
        int num = Integer.parseInt(console.nextLine());
        System.out.println();

        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> credits = new ArrayList<Integer>();
        ArrayList<Integer> scores = new ArrayList<Integer>();
        ArrayList<Character> grades = new ArrayList<Character>();

        for (int i = 1 ; i <= num ; i++) {
            System.out.printf("Enter course %d name:\n", i);
            names.add(console.nextLine());
            System.out.printf("Enter course %d credit hours:\n", i);
            credits.add(Integer.parseInt(console.nextLine()));
            System.out.printf("Enter course %d score:\n", i);
            scores.add(Integer.parseInt(console.nextLine()));
        }
        for (int i = 0 ; i < num ; i++) {
            if (scores.get(i) >= 90) {
                grades.add('A');
            } else if (scores.get(i) >= 80) {
                grades.add('B');
            } else if (scores.get(i) >= 70) {
                grades.add('C');
            } else if (scores.get(i) >= 60) {
                grades.add('D');
            } else {
                grades.add('F');
            }
        }

        System.out.printf("\n%-7s %-5s %-5s %6s\n", "Course", "Hours", "Score", "Grade");
        for (int i = 0 ; i < num ; i++) {
            System.out.printf("%-8s %-5d %-5d %-6c\n", names.get(i), credits.get(i), scores.get(i), grades.get(i));
        }
    }
}
