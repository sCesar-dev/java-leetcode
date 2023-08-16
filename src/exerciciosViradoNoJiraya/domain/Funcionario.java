package exerciciosViradoNoJiraya.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if (idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }



    public void imprimirDados(){
        System.out.println("""
                \n------------------------
                Nome: """ + this.nome);
        System.out.println("Idade :" + this.idade);
        System.out.println("Salário :" + this.salario);
    }

    public void mediaSalario(double... salarios){
        double soma = 0;
        for (double num: salarios){
            soma += num;
        }
        soma /= salarios.length;
        System.out.println("\nMédia dos salários: " + soma);
    }


}
