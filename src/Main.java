import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        Gson gson = new Gson();
        Http http = new Http();
        List<Endereco> listaEndereco = new ArrayList<>();
        GravaJson grava = new GravaJson();


        // Menu
        var sair = 1;
        while (sair != 0) {

            System.out.println("Digite um Cep para pesquisa: ");

            String cep = leitura.next();
            Endereco endereco = http.sendGetRequest(cep); // Usando a classe Record
            listaEndereco.add(endereco);
            grava.gravaJson(endereco);
            System.out.println("Tamanho total da lista: " + listaEndereco.size());
            System.out.println("Imprimindo Lista: "+ listaEndereco);


            System.out.println("Digite '0' para sair ou '1' para continuar.");
            sair = leitura.nextInt();
            if (sair == 0) {
                System.out.println("Fim do programa.");
            }


        }
    }
}