package je29_arrays;

import java.util.HashSet;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        Set linguagens = new HashSet();
//        System.out.println("capacidade atual de listagens: " + linguagens.size());
        linguagens.add("Go");
        linguagens.add("JavaScript");
        linguagens.add("Java");
        linguagens.add("C#");
        linguagens.add("Java");
        linguagens.remove("Go");
        System.out.println("capacidade atual de listagens: " + linguagens.size());
        linguagens.add("Python");
        System.out.println("capacidade atual de listagens: " + linguagens.size());
        System.out.println("Contem a linguagem Go?: " + linguagens.contains("Go"));

        for(Object linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
}
