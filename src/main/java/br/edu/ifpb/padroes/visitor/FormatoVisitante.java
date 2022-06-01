package br.edu.ifpb.padroes.visitor;


public interface FormatoVisitante{
    public void visitarTitulo(String t);
    public void visitarSubtitulo(String t);
    public void visitarParagrafo(String p);
    public void visitarTabela();
    public void visitarTabelaCabecalho(String... ct);
    public void visitarTabelaLinha(Object... o);
    public void visitarTabelaFim();
    public void visitarImagem(String path);
    public Object getResultado();
}