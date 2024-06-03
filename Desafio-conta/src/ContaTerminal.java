import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        double saldo = Double.valueOf(args[0]);
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem Vindo ao Banco X ! ");
        System.out.println("Por favor, digite seu nome !: ");
        String nome = scanner.nextLine();
       
        System.out.println("Por favor, digite o número da sua Agência !: ");
        String agencia = scanner.nextLine();

        System.out.println("Pra finalizar, digite o número da sua conta !: ");
        int numeroDaConta = scanner.nextInt();
    
        System.out.println("Olá " + nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numeroDaConta + " e seu saldo é de: " + saldo + " dawdjá está disponível para saque.");



    
    
    
    
    
    
    
    
    }


    
}
