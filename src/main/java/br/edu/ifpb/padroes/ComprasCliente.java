package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Cliente;
import br.edu.ifpb.padroes.domain.Item;
import br.edu.ifpb.padroes.visitor.FormatoVisitante;
import br.edu.ifpb.padroes.visitor.Relatorio;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ComprasCliente implements Relatorio {
        private Cliente cliente;
        private List<Item> items;

        @Override
        public Object gerarRelatorio(FormatoVisitante fv) {
            fv.visitarTitulo("Compras de "+cliente.getNome());
            fv.visitarParagrafo("CPF "+ cliente.getCPF());
            fv.visitarParagrafo("Cliente desde "+ cliente.getDataCadastro());
            fv.visitarTabela();
            fv.visitarTabelaCabecalho("Produto", "Data", "Valor");
            for(Item i : items) {
                fv.visitarTabelaLinha(i.getProduto(),
                        i.getDataCompra(), i.getValor());
            }
            fv.visitarTabelaFim();
            return fv.getResultado();
    }
}
