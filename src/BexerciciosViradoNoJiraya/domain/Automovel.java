package BexerciciosViradoNoJiraya.domain;

public class Automovel {

    //6) Efetuar o cálculo de quantos litros de combustível um automóvel consome em uma
    //viagem. Sabendo que o automóvel tem uma autonomia de 12 Km por litro de
    //combustível, desenvolva o cálculo utilizando a fórmula abaixo:
    //Formula
    //Formula
    //Onde:
    //D = Distância em Km
    //T = Tempo gasto na viagem
    //V = Velocidade

    private String modelo, marca, cor;
    private int T, V;


    public Automovel(String modelo, String marca, String cor, int T, int V){
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.T = T;
        this.V = V;
    }

    public void calcularValor(){
        double D = this.T * this.V;
        double LU = D / 12;
        System.out.println("Litros usados na viagem: " + LU);
    }
}
