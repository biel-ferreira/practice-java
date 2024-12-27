package je12_poo.enums;

public enum EstadoBrasileiro {
    PI ("Piaui", "PI"),
    MA("Maranhão", "MA"),
    SP("São Paulo", "SP"),
    RJ("Rio de Janeiro", "RJ"),
    MG("Minas Gerais", "MG"),
    BA("Bahia", "BA");


    private String name;
    private String sigla;

    private EstadoBrasileiro(String name, String sigla) {
        this.name = name;
        this.sigla = sigla;
    }

    public String getNome() {
        return name;
    }

    public String getSigla() {
        return sigla;
    }
}
