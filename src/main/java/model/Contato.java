package model;

import enums.TipoRelacionamento;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contato {
    private int codigo;
    private String nome;
    private String telefone;
    private TipoRelacionamento relacionamento;

    public Contato(int codigo, String nome, String telefone, TipoRelacionamento relacionamento) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.relacionamento = relacionamento;
    }
}
