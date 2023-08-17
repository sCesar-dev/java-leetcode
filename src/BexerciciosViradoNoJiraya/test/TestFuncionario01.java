package BexerciciosViradoNoJiraya.test;

import BexerciciosViradoNoJiraya.domain.Funcionario;

public class TestFuncionario01 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario();
        Funcionario funcionarioMedia = new Funcionario();

        funcionario1.setNome("Fulano");
        funcionario1.setIdade(18);
        funcionario1.setSalario(1300.85);
        funcionario1.imprimirDados();

        funcionario2.setNome("Sicrano");
        funcionario2.setIdade(27);
        funcionario2.setSalario(1570.54);
        funcionario2.imprimirDados();

        funcionario3.setNome("Beltrano");
        funcionario3.setIdade(35);
        funcionario3.setSalario(3700.85);
        funcionario3.imprimirDados();

        funcionarioMedia.mediaSalario(funcionario1.getSalario(), funcionario2.getSalario(), funcionario3.getSalario());

    }
}
