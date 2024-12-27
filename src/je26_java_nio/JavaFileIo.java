package je26_java_nio;

import java.io.File;
import java.io.IOException;

public class JavaFileIo {
    public static void main(String[] args) {
        File diretorio = new File("c:\\rocket\\curso-java");
        System.out.println("DIretorio existe ?" + diretorio.exists());
        if(!diretorio.exists()){
            diretorio.mkdirs();
            System.out.println("foi criado o diretorio");
        }

        try {
            File arquivo = new File(diretorio, "aula-java.txt");
            arquivo.createNewFile();
            System.out.println(arquivo.exists());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
