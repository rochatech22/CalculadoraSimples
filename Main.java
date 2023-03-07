import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean sair = false;
        Scanner scan = new Scanner(System.in);

        while (!sair) {
            System.out.println("Qual operação quer fazer? (SOMA, SUBTRAÇÃO, DIVISÃO, MULTIPLICAÇÃO)");
            System.out.println("OBS: para sair escreva 'SAIR'");
            String op = scan.next();
            try {
                if (op.equalsIgnoreCase("soma")) {
                    System.out.println("insira o termo X: ");
                    double x = scan.nextDouble();

                    System.out.println("insira o termo Y: ");
                    double y = scan.nextDouble();

                    Operacoes soma = Operacoes.SOMA;
                    System.out.println(soma.executarOperacao(x, y));
                }
            } catch (Exception e) {
                System.out.println("Dados inserido incorretamente");
            }
            try {
                if (op.equalsIgnoreCase("subtração")) {
                    System.out.println("insira o termo X: ");
                    double x = scan.nextDouble();

                    System.out.println("insira o termo Y: ");
                    double y = scan.nextDouble();

                    Operacoes subtracao = Operacoes.SUBTRAI;
                    System.out.println(subtracao.executarOperacao(x, y));
                }
            } catch (Exception e) {
                System.out.println("Dados inserido incorretamente");
            }
            try {
                if (op.equalsIgnoreCase("multiplicação")) {
                    System.out.println("insira o termo X: ");
                    double x = scan.nextDouble();

                    System.out.println("insira o termo Y: ");
                    double y = scan.nextDouble();

                    Operacoes multiplica = Operacoes.MULTIPLICA;
                    System.out.println(multiplica.executarOperacao(x, y));
                }
            } catch (Exception e) {
                System.out.println("Dados inserido incorretamente");
            }
            try {
                if (op.equalsIgnoreCase("divisão")) {
                    System.out.println("insira o termo X: ");
                    double x = scan.nextDouble();

                    System.out.println("insira o termo Y: ");
                    double y = scan.nextDouble();

                    Operacoes divide = Operacoes.DIVIDE;
                    System.out.println(divide.executarOperacao(x, y));
                }
            } catch (Exception e) {
                System.out.println("Dados inserido incorretamente");
            }
            if (op.equalsIgnoreCase("sair")) {
                sair = true;
            }
        }
    }
}