import java.util.Scanner;

public enum Operacoes {
    SOMA{
        @Override
        double executarOperacao(double x, double y) {
            return x + y;
        }
    }, SUBTRAI{
        @Override
        double executarOperacao(double x, double y) {
            return x - y;
        }
    }, MULTIPLICA{
        @Override
        double executarOperacao(double x, double y) {
            return x * y;
        }
    }, DIVIDE{
        @Override
        double executarOperacao(double x, double y) {
            return x / y;
        }
    };

    Operacoes() {

    }

    abstract double executarOperacao(double x, double y);
}
