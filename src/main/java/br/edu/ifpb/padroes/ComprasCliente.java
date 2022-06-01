package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Cliente;
import br.edu.ifpb.padroes.domain.Item;
import br.edu.ifpb.padroes.visitor.Visitor;
import br.edu.ifpb.padroes.visitor.Relatorio;
import br.edu.ifpb.padroes.visitor.elementos.ImagemElemento;
import br.edu.ifpb.padroes.visitor.elementos.ParagrafoElemento;
import br.edu.ifpb.padroes.visitor.elementos.TabelaElemento;
import br.edu.ifpb.padroes.visitor.elementos.TituloElemento;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

@Getter
@Setter
public class ComprasCliente implements Relatorio {
        private Cliente cliente;
        private List<Item> items;

        @Override
        public String gerarRelatorio(Visitor fv) {

            TituloElemento tituloElemento = new TituloElemento("Compras de "+cliente.getNome());
            ParagrafoElemento paragrafoElemento1 = new ParagrafoElemento("CPF "+ cliente.getCPF());
            ParagrafoElemento paragrafoElemento2 = new ParagrafoElemento("Cliente desde "+ cliente.getDataCadastro().toString());

            TabelaElemento tabelaElemento = new TabelaElemento(
                    asList("Produto", "Data", "Valor"),
                    items.stream().map( item ->
                            asList(
                                    item.getProduto(),
                                    item.getDataCompra().toString(),
                                    item.getValor().toString()))
                            .collect(Collectors.toList()));

            ImagemElemento imagemElemento = new ImagemElemento("imagem.gif");

            return fv.getResultado(
                    tituloElemento,
                    paragrafoElemento1,
                    paragrafoElemento2,
                    tabelaElemento,
                    imagemElemento
            );
    }
}
