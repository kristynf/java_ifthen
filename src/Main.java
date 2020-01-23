import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer="y";
        do {
            System.out.println("Please enter the student number grade: ");

            int grade = sc.nextInt();
            answer=sc.nextLine();

            if (grade >= 97 && grade <= 100)
                System.out.println("A+");

            else if (grade >= 94 && grade <= 96)

                System.out.println("A");

            else if (grade >= 90 && grade <= 93)
                System.out.println("A-");


            else if (grade >= 87 && grade <= 89)
                System.out.println("B+");


            else if (grade >= 84 && grade <= 86)
                System.out.println("B");


            else if (grade >= 80 && grade <= 83)
                System.out.println("B-");

            else if (grade >= 77 && grade <= 79)
                System.out.println("C+");

            else if (grade >= 74 && grade <= 76)
                System.out.println("C");


            else if (grade >= 70 && grade <= 73)
                System.out.print("C-");

            else if (grade >= 60 && grade <= 69)
                System.out.println("Fail!");

            System.out.println("Do you have more grades to enter y/n: ");
            answer = sc.nextLine();}
        while (answer.equalsIgnoreCase("y"));


}}