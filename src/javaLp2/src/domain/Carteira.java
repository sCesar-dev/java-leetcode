package domain;

public class Carteira {
    public String numero, cpf, tipo, situacao;
    public int pontos, dtDeValidade, dtDeExpd;

    public void criarCarteira(String numero, String cpf, String tipo, int dtDeValidade, int dtDeExpd, int pontos, String situacao)
    {
        this.numero = numero;
        this.cpf = cpf;
        this.tipo = tipo;
        this.dtDeValidade = dtDeValidade;
        this.dtDeExpd = dtDeExpd;
        this.pontos = pontos;
        this.situacao = situacao;
    }

    public void acrescentarPontos()
    {
        pontos++;
    }

    public void consultarSaldo()
    {
        System.out.println("Saldo de pontos: " + pontos);
    }

    public void zerarCarteira()
    {
        pontos = 0;
    }

    public void apreenderCarteira()
    {
        situacao = "APREENDIDA";
        System.out.println("Carteira foi apreendida.");
    }

    public void verificarValidade()
    {
        if(dtDeValidade < dtDeExpd)
        {
            situacao = "VENCIDA";
        }
        if(situacao != "VALIDA")
        {
            System.out.println("Sua carteira não está valida.");
        }
    }
}
