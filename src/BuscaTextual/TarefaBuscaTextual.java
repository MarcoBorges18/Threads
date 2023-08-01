package BuscaTextual;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable{

    private String nomeArquivo;
    private String nomePessoa;

    public TarefaBuscaTextual(String nomeArquivo, String nomePessoa) {
        this.nomeArquivo = nomeArquivo;
        this.nomePessoa = nomePessoa;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));

            int numLinha = 1;

            while(scanner.hasNextLine()){
                String linha = scanner.nextLine();

                if(linha.contains(nomePessoa)){
                    System.out.println(nomeArquivo + " - " + numLinha + " - " + linha);
                }

                numLinha++;
            }

            scanner.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
