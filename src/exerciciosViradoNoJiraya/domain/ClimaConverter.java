package exerciciosViradoNoJiraya.domain;

public class ClimaConverter {
    //Celsius para Fahrenheit
    //Fahrenheit para Celsius
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
