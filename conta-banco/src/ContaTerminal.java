import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        int numero;
        String agencia, nomeCliente;
        float saldo;
        System.out.println("Por favor, digite o número da Agência !");
        numero = leia.nextInt();
        leia.nextLine();
        System.out.println("Por favor, digite sua agência!");
        agencia = leia.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = leia.nextLine();
        System.out.println("Por favor, digite seu saldo!");
        saldo = leia.nextFloat();
        System.out.println("Olá" + nomeCliente + ",obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
