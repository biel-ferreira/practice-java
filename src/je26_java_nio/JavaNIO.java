package je26_java_nio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JavaNIO {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\rocket\\curso-java\\aula-java.txt");
            byte[] bytesArquivo = Files.readAllBytes(path);
//            System.out.println(bytesArquivo);
            String conteudo = new String(bytesArquivo);
//            System.out.println(conteudo);
//
//            String conteudoString = Files.readString(path);
//            System.out.println(conteudoString);

//            List<String> linhasConteudo = Files.readAllLines(path);
//            linhasConteudo.forEach(item-> System.out.println(item));

//            String newContent = "Marcia Aparecida";
//            Files.write(path, newContent.getBytes(StandardCharsets.UTF_8));

            List<String> names = new ArrayList<>();
            names.add("Gabriel");
            names.add("Giovana");

            StringBuilder contentList = new StringBuilder();
            names.forEach(item-> contentList.append(item + "\n"));

            Files.write(path, contentList.toString().getBytes(StandardCharsets.UTF_8));



        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
