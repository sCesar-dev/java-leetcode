package domain;

import java.util.ArrayList;
import java.util.List;

import domain.Shop;

/*    1. Considere a questão sobre a loja da lista anterior.

    Um shopping center possui um nome, e um conjunto de lojas. Construa a classe shopping center e forneça os seguintes membros:

    a) Um membro que permita verificar qual o nome de fantasia da loja com maior faturamento do shopping

    b) Um membro que permita verificar qual o faturamento médio das lojas com aluguel superior a R$1.000,00 .

*/

public class ShopCenter {
    
    private String nome;
    private List<Shop> shops;

    public ShopCenter(String nome, Shop... shops)
    {
        this.nome = nome;
        this.shops = new ArrayList<>();
        for(Shop s: shops)
        {
            this.shops.add(s);
        }
    }

    public void maiorFaturamento()
    {
        float maior = 0;
        for(Shop s: shops)
        {
            if(s.getFaturamento() > maior)
            {
                maior = s.getFaturamento();
            }
        }
        System.out.printf("\nO maior valor é %.4f", maior);
    }

    public void faturamentoMedio()
    {
        float total = 0;
        int cont = 0;

        for(Shop s: shops)
        {
            if(s.getAluguel() > 1000)
            {
                total += s.getAluguel();
                cont++;
            }
        }

        System.out.printf("\nValor do faturamento médio: %.4f", total/cont);
    }
}
