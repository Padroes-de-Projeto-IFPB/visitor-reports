package br.edu.ifpb.padroes.visitor;

public class VisitanteHTML implements FormatoVisitante {

    private StringBuilder sb = new StringBuilder();

    public void visitarTitulo(String t){
        sb.append("<h1>").append(t).append("</h1>");
    }

    public void visitarSubtitulo(String t){
        sb.append("<h2>").append(t).append("</h2>");
    }

    public void visitarParagrafo(String p){
        sb.append("<p>").append(p).append("</p>");
    }

    public void visitarTabela(){
        sb.append("<table>");
    }

    public void visitarTabelaCabecalho(String... ct){
        sb.append("<tr>");
        for(String s : ct)
            sb.append("<th>").append(s).append("</th>");
        sb.append("</tr>");
    }

    public void visitarTabelaLinha(Object... obs) {
        sb.append("<tr>");
        for (Object o : obs) {
            sb.append("<td>").append(o.toString()).append("</td>");
        }
        sb.append("</tr>");
    }

    public void visitarTabelaFim(){
        sb.append("</table>");
    }

    public void visitarImagem(String path){
        sb.append("<img src='").append(path).append("'>");
    }

    public Object getResultado(){
        return sb.toString();
    }
}
