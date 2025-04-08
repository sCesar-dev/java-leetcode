package tests;

import domain.Shop;

public class ShopTest
{
    public static void main(String[] args)
    {
        Shop loja1 = new Shop();
        Shop loja2 = new Shop();

        loja1.criaLoja("loja1", "loja1", "21332989000116", 16);
        loja2.criarLoja("loja2", "17660989000116", 15, 15000, "Adulto");
    }
}