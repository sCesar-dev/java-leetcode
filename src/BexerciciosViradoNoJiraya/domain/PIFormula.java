package BexerciciosViradoNoJiraya.domain;

public class PIFormula {
    //1)Baseado na fórmula abaixo escreva um programa que calcule e apresente a área de um
    //círculo.
    // Formula
    //2
    //Onde:
    //A representa a área do círculo
    //π = 3.141592654
    //R = Raio do círculo (deve ser fornecido pelo usuário)
    public double raio, area;
    public void imprimirValor(){
        area = 3.14 * (raio * raio);
        System.out.println("Área é igual a " + this.area + "metros quadrados.");
    }
}
