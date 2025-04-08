package domain;

public class Livro
{
    public String nome,autor;
    public float precoDeCusto;
    public int edicao, ano;

    public Livro(String nome, String autor, float precoDeCusto, int edicao, int ano)
    {
        this.nome = nome;
        this.autor = autor;
        this.precoDeCusto = precoDeCusto;
        this.edicao = edicao;
        this.ano = ano;
    }

    public void precoVendaLivro(int percentLucroLoja)
    {
        System.out.printf("Valor final de venda: %.2f", ((((float)percentLucroLoja /100)*precoDeCusto) + precoDeCusto));
    }

    public void imprimeLivro()
    {
        System.out.printf("""
                
                Nome do livro: %s
                Autor: %s
                Edicao: %d
                Ano: %d
                """, nome, autor, edicao, ano);
    }
}
