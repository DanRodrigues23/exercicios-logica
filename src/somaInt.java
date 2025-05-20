import java.util.Scanner;

public class somaInt {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Defina um numero para A: ");
        int A = scanner.nextInt();

        System.out.println("Defina um numero para B: ");
        int B = scanner.nextInt();

        int soma = A + B;

        if (A == B ){
            System.out.println("Os numeros são iguais, portanto a soma e: " + soma);

        }else{
            System.out.println("Os numeros são diferentes. ");
        }

        scanner.close();
    }
}
