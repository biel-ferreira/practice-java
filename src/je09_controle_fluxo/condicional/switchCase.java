package je09_controle_fluxo.condicional;

public class switchCase {
    public static void main(String[] args) {
        String sigla = "GG";

        switch (sigla) {
            case "P" : {
                System.out.println("Pequeno");
                break;
            }
            case "M" : {
                System.out.println("Médio");
                break;
            }
            case "G" : {
                System.out.println("Grande");
                break;
            }
            case "GG" : {
                System.out.println("Muito Grande");
                break;
            }
            default:
                System.out.println("Indefinido");
        }
    }
}
