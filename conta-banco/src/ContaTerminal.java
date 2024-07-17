import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor do saldo inicial R$: ");
        double saldo = scanner.nextDouble();

        System.out.println(String.format("Olá %S, obrigado por criar uma conta em nosso banco. Sua agência é %S, conta %d e seu saldo R$ %.2f já está disponível para saque.", nomeCliente, agencia, conta, saldo));

        scanner.close();
    }
}
