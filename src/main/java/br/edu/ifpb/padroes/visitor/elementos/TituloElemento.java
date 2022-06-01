package br.edu.ifpb.padroes.visitor.elementos;

import br.edu.ifpb.padroes.visitor.Visitor;
import lombok.Getter;

public class TituloElemento implements ElementoRelatorio {

    @Getter
    private String titulo;

    public TituloElemento(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitar(this);
    }
}
