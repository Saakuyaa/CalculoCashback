
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

//lendo variaveis
            System.out.println("Qual o seu nome ?");
            String nome = scanner.nextLine();

            System.out.println("Qual a sua idade ?");
            int idade = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Qual o valor da compra ? ex: 700,50 ");
            double valorCompra = scanner.nextDouble();

// logica do cashback
            double porcentagemCashback;
            if (idade >= 21 && valorCompra < 1000) {
                porcentagemCashback = 5.0;
            } else if (idade < 21 && valorCompra < 1000) {
                porcentagemCashback = 7.0;
            } else if (idade >= 21 && valorCompra >= 1000) {
                porcentagemCashback = 7.0;
            } else {
                porcentagemCashback = 10.0;
            }

// calculo do cashback
            double valorCashback = (porcentagemCashback / 100) * valorCompra;

//impressao dos dados
            System.out.println("Cliente: " + nome);
            System.out.println("Idade: " + idade +  " Anos");
            System.out.printf("Valor da Compra: R$ %.2f\n", valorCompra);
            System.out.printf("Valor do Cashback: R$ %.2f\n", valorCashback);

            scanner.close();

        }
    }



