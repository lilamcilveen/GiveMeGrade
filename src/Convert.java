import java.util.Scanner;
import java.io.*;

public class Convert {
    /* Purpose: converts a given numerical grade to a letter grade             *
     * Input  : a number                                                       *
     * output : the letter grade (F, D-, D, ..., A+) corresponding to the      *
     *          input grade if the input is valid, "Invalid" otherwise         */

    public static String convertToLetter(double grade) {
        if (grade >= 0 && grade < 50)
            return "F";

        else if (grade >= 50 && grade < 53)
            return "D-";

        else if (grade >= 53 && grade < 57)
            return "D";

        else if (grade >= 57 && grade < 60)
            return "D+";

        else if (grade >= 60 && grade < 63)
            return "C-";

        else if (grade >= 63 && grade < 67)
            return "C";

        else if (grade >= 67 && grade < 70)
            return "C+";

        else if (grade >= 70 && grade < 73)
            return "B-";

        else if (grade >= 73 && grade < 77)
            return "B";

        else if (grade >= 77 && grade < 80)
            return "B+";

        else if (grade >= 80 && grade < 85)
            return "A-";

        else if (grade >= 85 && grade < 90)
            return "A";

        else if (grade >= 90 && grade <= 100)
            return "A+";

        return "Invalid";
    }

    /* I used a series of if/else statements for the first function, since you *
     * cannot use branching (switch/case) on double date types.                */

    public static int convertToGradePoint(String letterGrade) {
        switch (letterGrade) {
            case "F":
                return 0;

            case "D-":
                return 1;

            case "D":
                return 2;

            case "D+":
                return 3;

            case "C-":
                return 4;

            case "C":
                return 5;

            case "C+":
                return 6;

            case "B-":
                return 7;

            case "B":
                return 8;

            case "B+":
                return 9;

            case "A-":
                return 10;

            case "A":
                return 11;

            case "A+":
                return 12;
        }
        return -1;
    }

    public static void main(String[] args) {

        String userChoice;
        //System.out.print("Enter int, float, or quit : ");


        while (true) {
            System.out.print("Grade point <g>, letter <l>, or quit <q> ? : ");
            Scanner sc = new Scanner(System.in);
            userChoice = sc.nextLine();
            if (userChoice.equals("g")) {
                System.out.print("Enter grade point: ");

                String line = sc.nextLine();
                double a = Double.parseDouble(line);

                String output = convertToLetter(a);
                System.out.println(output);

            }
            else if (userChoice.equals("l")) {
                System.out.print("Enter grade letter: ");

                String b = sc.next().substring(0);


                int output = convertToGradePoint(b);
                System.out.println(output);

            } else if (userChoice.equals("q")) {
                System.out.println("good-bye");
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

}