package br.edu.ifpb.padroes.visitor.elementos;

import br.edu.ifpb.padroes.visitor.Visitor;

public interface ElementoRelatorio {
    String accept(Visitor visitor);
}
