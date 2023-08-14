package metodosIntrod.domain;

public class Calculadora {

    public void SomaNumeros(int num1, int num2){
        System.out.println(num1 + num2);
    }

    public void SubtraiNumeros(int num1, int num2){
        System.out.println(num1 - num2);
    }

    public void MultiplicaNumeros(int num1, int num2){
        System.out.println(num1 *num2);
    }

    public double DivideNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void AlteraDoisNumeros(int num1, int num2){
        System.out.println("Números anteriores" +
                "\nNúmero 1: " + num1 +
                "\nNúmero 2: " + num2);
        num1 = 77;
        num2 = 33;
        System.out.println("Os números foram alterados com sucesso " +
                "\nNúmero 1: " + num1 +
                "\nNúmero 2: " + num2);
    }
}
