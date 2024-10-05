import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int number = scanner.nextInt();
        
        boolean found = false;
        int a = 0, b = 1;

        while (a <= number) {
            if (a == number) {
                found = true;
                break;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }

        if (found) {
            System.out.println("O número " + number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + number + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
