import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        
        // Pedindo para o usuário informar um número
        System.out.print("Informe um número inteiro: ");
        int numero = sc.nextInt();
        
        // Calculando a sequência de Fibonacci até o número informado
        int primeiro = 0, segundo = 1, terceiro = 1;
        while (terceiro < numero) {
            terceiro = primeiro + segundo;
            primeiro = segundo;
            segundo = terceiro;
        }
        
        // Verificando se o número informado pertence à sequência
        if (terceiro == numero) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        
        // Fechando o objeto Scanner
        sc.close();
    }
}

