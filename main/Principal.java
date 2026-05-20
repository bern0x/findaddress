package br.com.alura.findcep.main;

import br.com.alura.findcep.exception.CepInvalidoException;
import br.com.alura.findcep.exception.CepNaoEncontradoException;
import br.com.alura.findcep.models.Address;
import br.com.alura.findcep.service.ConvertAddress;
import br.com.alura.findcep.service.FindAddress;
import br.com.alura.findcep.util.FileGenerator;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o seu CEP: ");
        String cep = in.nextLine();

        try {
            cep = cep.replace("-", "");
            if (cep.length() != 8) {
                throw new CepInvalidoException("CEP inválido!");
            }

            FindAddress consulta = new FindAddress();
            String json = consulta.findAddress(cep);

            if (json.contains("\"erro\"")) {
                throw new CepNaoEncontradoException("CEP não encontrado!");
            }

            ConvertAddress conversor = new ConvertAddress();
            Address address = conversor.convert(json);
            System.out.println(address);

            FileGenerator escritor = new FileGenerator();
            escritor.fileCreator(address);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage());
        } catch (CepNaoEncontradoException e){
            System.out.println(e.getMessage());
        }

    }
}
