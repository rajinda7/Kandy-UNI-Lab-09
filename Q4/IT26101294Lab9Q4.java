import java.util.Scanner;

public class IT26101294Lab9Q4 {
    
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark*0.30)+(examMark*0.70);
    }

    public static char findGrades(double mark) {
        if (mark>=75) {
            return 'A';
        } else if (mark>=60) {
            return 'B';
        } else if (mark>=50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-15s %-13.2f %c\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];

        for (int i=0; i<5; i++) {
            System.out.print("Enter Name of Student " +(i+1)+ ": ");
            names[i] = scanner.next();
            
            while (true) {
                System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
                assignmentMarks[i] = scanner.nextDouble();
                if (assignmentMarks[i] >=0 && assignmentMarks[i] <= 100) {
                    break;
                } else {
                    System.out.println("entered mark is incorrect, plase enter a correct mark value (out of 100)");
                }
            }
            
            while (true) {
                System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
                examMarks[i] = scanner.nextDouble();
                if (examMarks[i]>=0 && examMarks[i]<=100) {
                    break;
                } else {
                    System.out.println("entered mark is incorrect, plase enter a correct mark value");
                }
            }
            System.out.println(); 
        }
        System.out.printf("%-15s %-13s %s\n", "Name", "Final Mark", "Grade");
        
        for (int i=0; i<5; i++) {
            double finalMark=calcFinalMark(assignmentMarks[i],examMarks[i]);
            char grade=findGrades(finalMark);
            printDetails(names[i],finalMark,grade);
        }
        
        scanner.close();
    }
}