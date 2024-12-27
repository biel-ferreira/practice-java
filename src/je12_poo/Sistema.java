package je12_poo;

public class Sistema {
    public static void main(String[] args) {
        Cliente ferreira = new Cliente("Gabriel Ferreira", 200.0);

        ferreira.buy(50.0);



        Cliente passeti = new Cliente("Giovana Passeti", 400.0);

        passeti.buy(150.0);

        System.out.println("Limite do(a) " + ferreira.name + " é " + ferreira.creditLimit);

        System.out.println("Limite do(a) " + passeti.name + " é " + passeti.creditLimit);

    }
}
