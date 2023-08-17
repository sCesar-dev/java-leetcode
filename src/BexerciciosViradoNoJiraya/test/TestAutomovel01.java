package BexerciciosViradoNoJiraya.test;

import BexerciciosViradoNoJiraya.domain.Automovel;

public class TestAutomovel01 {
    public static void main(String[] args) {
        Automovel automovel1 = new Automovel("Clio", "Renault", "Branco", 50, 120);
        automovel1.calcularValor();
    }
}
