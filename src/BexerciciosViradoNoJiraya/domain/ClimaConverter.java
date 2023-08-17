package BexerciciosViradoNoJiraya.domain;

public class ClimaConverter {
    //3) Escreva um programa que realize a conversão de graus Celsius (C) para graus
    //Fahrenheit (F). Utilize a fórmula abaixo:
    //*Formula*
    //4) Escreva um programa que realize a conversão de graus Fahrenheit (F) para graus
    //Celsius (C). Utilize a fórmula abaixo:
    //*Formula*

    public int F, C, var1, var2;

    public void menu(){
        System.out.println("""
                    Menu\s
                    -----------------------
                    1 - Converter F para C
                    2 - Converter C para F
                    """);
    }

    public void calcular(){
        if (var1 == 1){
            F = var2;
            C = ((F - 32) * 5) / 9;
            System.out.println("Será " + this.C + " graus.");
        }else{
            C = var2;
            F = ((9 * C) / 5) + 32;
            System.out.println("Será " + this.F + " Fahrenheit.");
        }
    }
}
