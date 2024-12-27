package java_beans;

public class Objetos {
    public static void main(String[] args) {
        Aluno gabriel = new Aluno();
        System.out.println(gabriel.getName());
        System.out.println(gabriel.getAge());
        gabriel.setName("Gabriel Ferreira");
        gabriel.setAge(24);
        System.out.println(gabriel.getName());
        System.out.println(gabriel.getAge());
    }
}
