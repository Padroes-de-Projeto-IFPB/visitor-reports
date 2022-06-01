package br.edu.ifpb.padroes;

import br.edu.ifpb.padroes.domain.Cliente;
import br.edu.ifpb.padroes.domain.Item;
import br.edu.ifpb.padroes.visitor.Visitor;
import br.edu.ifpb.padroes.visitor.VisitanteHTML;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Diego");
        cliente.setCPF("000.000.000-22");
        cliente.setDataCadastro(LocalDateTime.now());

        List<Item> itens = new ArrayList<>();
        itens.add(Item.builder()
                        .id(1L)
                        .valor(BigDecimal.valueOf(2.55))
                        .produto("Coxinha")
                        .dataCompra(LocalDateTime.now())
                .build());

        ComprasCliente comprasCliente = new ComprasCliente();
        comprasCliente.setCliente(cliente);
        comprasCliente.setItems(itens);

        Visitor fv = new VisitanteHTML();

        String resultado = comprasCliente.gerarRelatorio(fv);
        System.out.println(resultado);

    }
}
