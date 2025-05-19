import java.util.Scanner;

public class numeroParOuImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();


        if (num > 0){
            System.out.println("O número é positivo. ");

        }else if (num < 0) {
            System.out.println("O número é negativo. ");

        }else{
            System.out.println("O número é 0");
            scanner.close();
            return;
        }


        if(num % 2 == 0){
            System.out.println("O número par ");
        }else{
            System.out.println("O número é impar ");
        }

            scanner.close();

   }
}
