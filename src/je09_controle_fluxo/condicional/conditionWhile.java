package je09_controle_fluxo.condicional;

public class conditionWhile {
    public static void main(String[] args) {
        double mesada = 100.0;

        while(mesada > 0) {
            double compra = randomValue();
            if(compra > mesada) {
                compra = mesada;
            }
            mesada = mesada - compra;
            System.out.printf("\nVoce comprou um doce de valor : %.2f\n e agora o seu saldo é de %.2f", compra, mesada);
        }
    }


    private static double randomValue() {
        double randomDouble = Math.random();
        return randomDouble;
    }
}
