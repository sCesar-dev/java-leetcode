package tests;

import domain.Shop;
import domain.ShopCenter;

public class ShopTest
{
    public static void main(String[] args)
    {
        Shop loja1 = new Shop();
        Shop loja2 = new Shop();
        Shop loja3 = new Shop();
        ShopCenter shops = new ShopCenter("Grand Shopping", loja1, loja2, loja3);
        

        loja1.criaLoja("loja1", "loja1", "21332989000116", 16);
        loja2.criarLoja("loja2", "17660989000116", 15, 15000, "Adulto");
        loja3.criarLoja("loja3", "05157666000116", 16, 1300, "Infantil");

        loja2.calcAluguel(10);
        loja3.calcAluguel(20);

        shops.maiorFaturamento();
        shops.faturamentoMedio();
    }
}