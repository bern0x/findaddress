package br.com.alura.findcep.models;

public record Address(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String localidade,
        String uf,
        String estado,
        String regiao,
        String ddd
) {
    @Override
    public String toString() {
        return  "CEP: " + cep + "\n" +
                "Logradouro: " + logradouro + "\n" +
                "Complemento: " + complemento + "\n" +
                "Bairro: " + bairro + "\n" +
                "Localidade: " + localidade + "\n" +
                "UF: " + uf + "\n" +
                "Estado: " + estado + "\n" +
                "Regiao: " + regiao + "\n" +
                "DDD: " + ddd + "\n";
    }
}
