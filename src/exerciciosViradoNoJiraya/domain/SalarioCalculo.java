package exerciciosViradoNoJiraya.domain;

public class SalarioCalculo {
    //SB = Salário Base     x
    //HT = Horas Trabalhadas
    //VH = Valor Hora de trabalho
    //TD = Total de Descontos   x
    //PD = Percentual de Desconto
    //SL = Salário Líquido  x

    public int HT, PD;
    public double VH, SL;

    public void calcularSalario(){
        double SB = HT * VH;
        double TD = ((double) PD / 100) * SB;
        SL = SB - TD;
    }
}
