package je05_tiposWrappers;

public class TiposWrappers {
    public static void main(String[] args) {
        // conversao explicita
        Double numeroDouble = 123.56;
        Integer numeroInt = numeroDouble.intValue();
        System.out.println(numeroInt);

        String num = "100";
        int i = Integer.parseInt(num);
        System.out.println(i);



    }
}
