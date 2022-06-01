package br.edu.ifpb.padroes.visitor.elementos;

import br.edu.ifpb.padroes.visitor.Visitor;
import lombok.Getter;

public class ParagrafoElemento implements ElementoRelatorio {

    @Getter
    private String paragrafo;

    public ParagrafoElemento(String paragrafo) {
        this.paragrafo = paragrafo;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitar(this);
    }
}
