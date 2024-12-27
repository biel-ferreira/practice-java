package java_beans;

public class Aluno {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        if(newAge < 0) {
            throw new IllegalArgumentException("o valor da idade deve ser positivo");
        }
        this.age = newAge;
    }
}
