package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

@Getter
@Setter
public class Cliente {
    private String id;
    private String nome;
    private String endereco;
    private String email;
    private SortedSet<Contato> contatos;

    public Cliente(String id, String nome, String endereco, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.contatos = new TreeSet<>(Comparator.comparing(Contato::getCodigo));
    }

    public void adicionarContato(Contato contato) {
        for (Contato c : contatos) {
            if (c.getTelefone().equals(contato.getTelefone()) && c.getRelacionamento().equals(contato.getRelacionamento())) {
                throw new IllegalArgumentException("Não é permitido ter contatos com o mesmo telefone e tipo de relacionamento.");
            }
        }
        contatos.add(contato);
    }
}
