package domain;
/**
 * Escreva uma descrição da classe Medicamento aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Medicamento
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome, principioAtivo;
    private float precoDeCusto;
    
    public String getNome()
    {
        return nome;
    }
    
    public String getPrincipioAtivo()
    {
        return principioAtivo;
    }
    
    public float getPrecoDeCusto()
    {
        return precoDeCusto;
    }
    
    public void criaMedicamento(String nome, String principioAtivo, float precoDeCusto)
    {
        this.nome = nome;
        this.principioAtivo = principioAtivo;
        this.precoDeCusto = precoDeCusto;
    }
    
    public void criaMedicamento(String nome, float precoDeCusto)
    {
        this.nome = nome;
        this.principioAtivo = nome;
        this.precoDeCusto = precoDeCusto;
    }
    
    public void precoDeVenda(float percentualLucro)
    {
        float precoFinal = (getPrecoDeCusto() * (percentualLucro / 100)) + getPrecoDeCusto();
        System.out.printf("Preco do medicamento: %.4f", precoFinal);
    }
    
    public void precoDeVenda()
    {
        double precoFinal = (getPrecoDeCusto() * 0.3) + getPrecoDeCusto();
        System.out.printf("Preco do medicamento: %.4f", precoFinal);
    }
}
