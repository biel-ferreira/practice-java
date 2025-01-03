package je28_expressoes;

public class ExpressoesSimples {
    public static void main(String[] args) {
        String name = "Gabriel";
        String otherName = "Ferreira";
        String printedText = "Ola ".concat(name).concat(" ").concat(otherName);

        Integer matricula = 123;
        Double salario = 11000.0;

        String expressaoTexto = String.format("Ola %s %s", name, otherName);
        //s, d, f, t

        String dadosFuncionario = String.format("Mat: %d - Nome: %s - Sal.: %.2f", matricula, name, salario);

        System.out.println(printedText);
        System.out.println(expressaoTexto);
        System.out.println(dadosFuncionario);
    }
}
