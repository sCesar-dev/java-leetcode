package exerciciosViradoNoJiraya.test;

import exerciciosViradoNoJiraya.domain.ClimaConverter;

import java.util.Scanner;

public class TestClima01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClimaConverter clima = new ClimaConverter();

        clima.menu();
        clima.var1 = sc.nextInt();
        if (clima.var1 < 1 || clima.var1 > 2){
            System.out.println("Número inválido, o programa será encerrado.");
        }else {
            System.out.println("Digite o valor de C/F: ");
            clima.var2 = sc.nextInt();
            clima.calcular();
        }
    }
}
