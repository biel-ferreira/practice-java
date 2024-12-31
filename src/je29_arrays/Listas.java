package je29_arrays;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List linguagens = new ArrayList();
//        System.out.println("capacidade atual de listagens: " + linguagens.size());
        linguagens.add("Go");
        linguagens.add("JavaScript");
        linguagens.add("Java");
        linguagens.add("C#");
        linguagens.add("Java");
        linguagens.remove("Go");
        System.out.println("capacidade atual de listagens: " + linguagens.size());
        System.out.println("a linguagem java esta na posicao: " + linguagens.indexOf("Java"));
        System.out.println("Qual elemento esta na posicao 2: " + linguagens.get(2));
        linguagens.add(2, "Python");
        System.out.println("capacidade atual de listagens: " + linguagens.size());
        System.out.println("a linguagem java esta na posicao: " + linguagens.indexOf("Java"));
        System.out.println("Qual elemento esta na posicao 2: " + linguagens.get(2));
        System.out.println("Contem a linguagem Go?: " + linguagens.contains("Go"));

        for(Object linguagem : linguagens) {
            System.out.println(linguagem);
        }
    }
}
