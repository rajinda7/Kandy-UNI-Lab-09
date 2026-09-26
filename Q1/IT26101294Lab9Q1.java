import java.util.Scanner;

public class IT26101294Lab9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter value c: ");
        double c = scanner.nextDouble();

        double determinant = Math.pow(b,2)-4*a*c;
        
        if (determinant>0) {
            double root1=(-b+Math.sqrt(determinant))/(2*a);
            double root2=(-b-Math.sqrt(determinant))/(2 * a);
            System.out.println("Roots are real and different:");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else if (determinant == 0) {
            double root=-b/(2 * a);
            System.out.println("Roots are real and same:");
            System.out.printf("Root 1: %.2f\n", root);
            System.out.printf("Root 2: %.2f\n", root);
        } else {
            System.out.println("Roots are complex.");
        }
        
        scanner.close();
    }
}