import java.util.Scanner;
import java.util.Random;

public class Adivinhacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero = new Random().nextInt(10+1);
        int chute = 0;
        int tentativas = 0 + 1;
        
        while (tentativas <= 5){
            System.out.println("Digite um número de 0 a 10 para ser seu chute: ");
            chute = sc.nextInt();
            if (chute == numero){
                System.out.println("Voce acertou!!");
                if (tentativas == 1){
                    System.out.println("Você usou " + tentativas + "tentativa!");
                }else{
                    System.out.println("Você usou " + tentativas + " tentativas!");
                }
                break;
            }else if (chute > numero){
                System.out.println("O número é menor que o chute");
            }else {
                System.out.println("O número é maior que chute");
            }
            tentativas ++;
        }
        System.out.println("Já foiii!");
    }
}
