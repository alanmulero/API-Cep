import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GravaJson {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public void gravaJson(Endereco endereco) throws IOException {

        FileWriter escrita = new FileWriter("enderecos.json");
        escrita.write(gson.toJson(endereco));
        escrita.close();

    }



}
