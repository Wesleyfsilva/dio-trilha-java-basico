import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Digite sua agencia");
        int agencia = scanner.nextInt();

        System.out.println("Digite sua conta");
        String conta = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu saldo");
        Double saldo = scanner.nextDouble();

    System.out.println("Olá " + nome + " seja bem vindo ao banco Rendmore " + " sua agencia é " + agencia + " sua conta é " + conta + "e o saldo disponivel para saque é R$ " + saldo);;


    }
}
