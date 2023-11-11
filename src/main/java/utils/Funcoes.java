package utils;

import model.Cliente;
import model.Contato;

public class Funcoes {

    public void imprimir(Cliente cliente){
        System.out.println("Cliente: "+cliente.getNome()+" - ID: "+cliente.getId());
        System.out.println("Email: "+cliente.getEmail());
        System.out.println("Endereço: "+cliente.getEndereco());
        System.out.println("Contatos: ");
        for (Contato c :cliente.getContatos()) {
            System.out.println();
            System.out.println("    Nome: " + c.getNome() + " - Codigo: "+c.getCodigo());
            System.out.println("    Telefone: "+c.getTelefone());
            System.out.println("    Relacionamento: "+c.getRelacionamento().toString());
        }
        System.out.println("----------------------------------");
    }

}
