package br.edu.ifpb.padroes.visitor.elementos;

import br.edu.ifpb.padroes.visitor.Visitor;

import java.util.List;

public class TabelaElemento implements ElementoRelatorio {

    private StringBuilder sb = new StringBuilder();

    private List<String> linhasCabecalho;

    private List<List<String>> linhasCorpo;

    public TabelaElemento(List<String> linhasCabecalho, List<List<String>> linhasCorpo) {
        this.linhasCabecalho = linhasCabecalho;
        this.linhasCorpo = linhasCorpo;
    }

    @Override
    public String accept(Visitor visitor) {
        sb.append(visitor.visitar(this));
        sb.append(visitor.visitar(this, linhasCabecalho.toArray(new String[]{})));
        sb.append(visitor.visitar(this, linhasCorpo));
        sb.append(visitor.visitar(this));
        return sb.toString();
    }

    public boolean isEmpty() {
        return sb.toString().isEmpty();
    }

}
