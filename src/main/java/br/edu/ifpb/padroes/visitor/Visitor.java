package br.edu.ifpb.padroes.visitor;


import br.edu.ifpb.padroes.visitor.elementos.*;

import java.util.List;

public interface Visitor {
    String visitar(TituloElemento t);
    String visitar(SubTituloElemento t);
    String visitar(ParagrafoElemento p);
    String visitar(TabelaElemento t);
    String visitar(TabelaElemento t, String... cabecalhos);
    String visitar(TabelaElemento t, List<List<String>> objetos);
    String visitar(ImagemElemento imagemElemento);
    String getResultado(ElementoRelatorio... elementos);
}