package br.edu.ifpb.padroes.visitor.elementos;

import br.edu.ifpb.padroes.visitor.Visitor;
import lombok.Getter;

public class SubTituloElemento implements ElementoRelatorio {

    @Getter
    private String subtitulo;

    public SubTituloElemento(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitar(this);
    }
}
