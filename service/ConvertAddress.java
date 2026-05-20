package br.com.alura.findcep.service;

import br.com.alura.findcep.models.Address;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConvertAddress {
    public Address convert(String json) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        Address address = gson.fromJson(json, Address.class);
        return address;
    }
}
