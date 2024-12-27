package je12_poo.enums;

public class SistemaEnumeracao {
    public static void main(String[] args) {
        String nameOfEnum = "SP";
        for(EstadoBrasileiro eb : EstadoBrasileiro.values()) {
            System.out.println(eb.getNome());
            System.out.println(eb.getSigla());
            System.out.println(eb.name());
        }


    }
}
