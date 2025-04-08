package domain;

public class Shop
{
    /*Uma loja de roupas possui um nome de fantasia, uma razão social, um número de cnpj, um dígito do cnpj, um valor de faturamento e uma área em m2. Construa uma classe loja conforme descrição acima e forneça os seguintes métodos:

    · Método que permita criar uma loja informando o nome de fantasia, a razão social, o cnpj e o digito do cnpj;

    · Método que permita criar uma loja informando o nome de fantasia, o cnpj e o digito do cnpj, o valor do faturamento e publico alvo. Neste caso considere que a razão social é igual ao nome de fantasia;

    · Método que permita verificar se uma loja tem faturamento superior ao de outra loja;

    · Método que permita calcular o valor do aluguel de uma loja. Sabe-se que o aluguel custa R$50,00 por m2. */


    private String nomeFantasia;

    private String razaoSocial;
    private String nrCnpj;
    private int digCnpj, area;
    private float faturamento;

    public String getNomeFantasia()
    {
        return nomeFantasia;
    }
    public String getRazaoSocial()
    {
        return razaoSocial;
    }
    public String getNrCnpj()
    {
        return nrCnpj;
    }

    public int getDigCnpj()
    {
        return digCnpj;
    }

    public float getFaturamento()
    {
        return faturamento;
    }
    public void setFaturamento(float faturamento)
    {
        this.faturamento = faturamento;
    }

    public int getArea()
    {
        return area;
    }

    public void criaLoja(String nomeFantasia, String razaosocial, String nrCnpj, int digCnpj)
    {
        System.out.printf("""
                Nome fantasia: %s
                Razao social: %s
                CNPJ: %s
                Digito do CNPJ: %d
                """, nomeFantasia, razaosocial, nrCnpj, digCnpj);
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaosocial;
        this.nrCnpj = nrCnpj;
        this.faturamento = -1;
        if (digCnpj < 10 || digCnpj > 99)
        {
            System.out.println("Numero invalido, tente novamente");
        }else
        {
            this.digCnpj = digCnpj;
        }
    }

    public void criarLoja(String nomeFantasia, String nrCnpj, int digCnpj, float faturamento, String pubAlvo)
    {
        System.out.printf("""
                Nome fantasia: %s
                CNPJ: %s
                Digito do CNPJ: %d
                Faturamento: %.2f
                pubAlvo: %s
                """, nomeFantasia, nrCnpj, digCnpj, faturamento, pubAlvo);
        this.razaoSocial = nomeFantasia;
        this.nrCnpj = nrCnpj;

        if (digCnpj < 10 || digCnpj > 99)
        {
            System.out.println("Numero invalido, tente novamente");
        }else
        {
            this.digCnpj = digCnpj;
        }

        if (faturamento < 0)
        {
            System.out.println("Faturamento negativo não aceito, tente novamente.");
        }else
        {
            this.faturamento = faturamento;
        }

    }

    public void comparaLojas(String nomeLoja1, float faturamento1, String nomeLoja2, float faturamento2)
    {
        if(faturamento1 > faturamento2)
        {
            System.out.printf("A loja %s tem faturamento superior à loja %s.", nomeLoja1, nomeLoja2);
        }else if(faturamento1 < faturamento2)
        {
            System.out.printf("A loja %s tem faturamento superior à loja %s.", nomeLoja2, nomeLoja1);
        }else
        {
            System.out.println("Os faturamentos são iguais.");
        }
    }

    public void calcAluguel(int area)
    {
        this.area = area;
        int aluguel = getArea() * 50;
        System.out.printf("\nValor do aluguel: %d", aluguel);
    }
}