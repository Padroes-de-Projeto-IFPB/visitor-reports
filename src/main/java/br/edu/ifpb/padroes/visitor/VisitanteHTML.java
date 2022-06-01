package br.edu.ifpb.padroes.visitor;

import br.edu.ifpb.padroes.visitor.elementos.*;

import java.util.List;

public class VisitanteHTML implements Visitor {

    public String visitar(TituloElemento t){
        return "<h1>" + t.getTitulo() + "</h1>";
    }

    public String visitar(SubTituloElemento t){
        return "<h2>" + t.getSubtitulo() + "</h2>";
    }

    public String visitar(ParagrafoElemento p){
        return "<p>" + p.getParagrafo() + "</p>";
    }

    public String visitar(TabelaElemento t){
        return t.isEmpty() ? "<table>" : "</table>";
    }

    public String visitar(TabelaElemento tabelaElemento, String... cabecalhos){
        StringBuilder sb = new StringBuilder("<tr>");
        for(String s : cabecalhos)
            sb.append("<th>").append(s).append("</th>");
        sb.append("</tr>");
        return sb.toString();
    }

    public String visitar(TabelaElemento tabelaElemento, List<List<String>> linhas) {
        StringBuilder sb = new StringBuilder();
        for (List<String> linha: linhas) {
            sb.append("<tr>");
            for (String coluna: linha){
                sb.append("<td>").append(coluna).append("</td>");
            }
            sb.append("</tr>");
        }
        return sb.toString();
    }

    public String visitar(ImagemElemento imagemElemento){
        return "<img src='" + imagemElemento.getPath() + "' />";
    }

    public String getResultado(ElementoRelatorio... elementos){
        StringBuilder sb = new StringBuilder();
        for (ElementoRelatorio elemento : elementos) {
            sb.append(elemento.accept(this));
        }
        return sb.toString();
    }
}
