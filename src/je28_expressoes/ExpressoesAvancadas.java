package je28_expressoes;

import java.time.LocalDate;

public class ExpressoesAvancadas {
    public static void main(String[] args) {
        String name = "Gabriel Araujo Ferreira da Silva";
        String otherName = "Ferreira";
        String printedText = "Ola ".concat(name).concat(" ").concat(otherName);

        Integer matricula = 123;
        Double salario = 11000.0;
        LocalDate dataAdmissao = LocalDate.of(2024, 12, 16);

        String dataFormat = String.format("Data: %td/%<tm/%<tY", dataAdmissao);

        String expressaoTexto = String.format("Ola %s %s", name, otherName);
        //s, d, f, t

        String dadosFuncionario = String.format("Mat: %05d - Nome: %-15.15s - Sal.: %,.2f", matricula, name, salario);

        System.out.println(printedText);
        System.out.println(expressaoTexto);
        System.out.println(dadosFuncionario);

        System.out.println(dataFormat);
    }
}
