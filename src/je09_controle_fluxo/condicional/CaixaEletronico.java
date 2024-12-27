package je09_controle_fluxo.condicional;

public class CaixaEletronico {
    public static void main(String[] args) {
        double amount = 17.0;
        double requestedValue = 17.0;

        if(requestedValue <= amount) {
            amount = amount - requestedValue;

            System.out.println("saque realizado com sucesso, o seu valor agora é de :" + amount);
        } else {
            System.out.println("o eu saldo nao é suficiente para esse saque");
        }
    }
}
