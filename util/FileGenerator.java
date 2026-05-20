package br.com.alura.findcep.util;

import br.com.alura.findcep.models.Address;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {
    public void fileCreator(Address address) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        FileWriter escrita = new FileWriter("address.json");
        escrita.write(gson.toJson(address));
        escrita.close();
    }
}
