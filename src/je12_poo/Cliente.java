package je12_poo;

public class Cliente {
    String name;
    Double creditLimit;


    public Cliente(String name, Double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
    }

    public void requestCreditLimit(Double requestedValue) {
        creditLimit = requestedValue;
    }

    public void buy(Double productValue) {
        if(productValue > creditLimit) {
            System.out.println("Compra negada na conta de " + name + " o valor da compra é maior que o seu creedito");
            return;
        }

        creditLimit = creditLimit - productValue;
        System.out.printf("Compra efetuada na conta de " + name + " seu novo saldo é : %.2f", creditLimit);
    }


}
