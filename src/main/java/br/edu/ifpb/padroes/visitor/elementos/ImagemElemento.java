package br.edu.ifpb.padroes.visitor.elementos;

import br.edu.ifpb.padroes.visitor.Visitor;
import lombok.Getter;

public class ImagemElemento implements ElementoRelatorio {

    @Getter
    private String path;

    public ImagemElemento(String path) {
        this.path = path;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitar(this);
    }
}
