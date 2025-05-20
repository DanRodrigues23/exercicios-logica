import java.util.Scanner;

public class somaInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina um numero para A: ");
        int A = scanner.nextInt();

        System.out.println("Defina um numero para B: ");
        int B = scanner.nextInt();

        int C;

        if (A == B ){
            C = A + B;

        }else{
            C = A * B;

        }
        System.out.println("O valor de C e: " + C);

        scanner.close();
    }
}
