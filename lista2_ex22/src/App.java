import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        int numero = ler.nextInt();
        System.out.println();

        ler.close();

        if((numero % 2) > 0){
            System.out.printf("%d é impar.",numero);
        }

        if((numero % 2) == 0){
            System.out.printf("%d é par.",numero);
        }
    }
}
