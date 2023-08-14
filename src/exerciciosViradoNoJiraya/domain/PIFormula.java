package exerciciosViradoNoJiraya.domain;

public class PIFormula {
    // PI = 3.14
    // Área do círculo = area
    // Raio = raio
    public double raio, area;
    public void imprimirValor(){
        area = 3.14 * (raio * raio);
        System.out.println("Área é igual a " + this.area + "metros quadrados.");
    }
}
