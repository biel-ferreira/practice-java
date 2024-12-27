package je09_controle_fluxo.condicional;

public class conditionDoWhile {
    public static void main(String[] args) {

        String []shows = {"CB", "PM", "TS", "CP", "TG", "BM", "TR"};
        int iterator = 0;
        do {
            // printar o show
            System.out.println(shows[iterator]);
            iterator++;
        } while(iterator < shows.length);

    }
}
