import enums.TipoRelacionamento;
import model.Cliente;
import model.Contato;
import utils.Funcoes;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        Cliente cliente = new Cliente("123", "João", "Rua Exemplo, 123", "joao@gmail.com");
        Cliente cliente2 = new Cliente("124", "Pedro", "Rua Exemplo 2, 000", "pedro@gmail.com");
        try {
            cliente.adicionarContato(new Contato(1, "Maria", "99999999", TipoRelacionamento.MAE));
            cliente.adicionarContato(new Contato(2, "José", "88888888", TipoRelacionamento.PAI));
            cliente2.adicionarContato(new Contato(4, "Amanda", "55555555", TipoRelacionamento.CONJUGE));
            cliente2.adicionarContato(new Contato(5, "Ulysses", "111111111", TipoRelacionamento.IRMAO));
            cliente.adicionarContato(new Contato(3, "José", "88888888", TipoRelacionamento.PAI));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        funcoes.imprimir(cliente);
        funcoes.imprimir(cliente2);
    }
}