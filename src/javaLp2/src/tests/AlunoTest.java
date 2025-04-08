package tests;

import domain.Student;

public class AlunoTest{

    public static void main(String[] args) {

        Student aluno1 = new Student();

        aluno1.criarAluno(0001, "fulano", 2024, "SI");
        System.out.printf("""
            Matricula: %d
            Nome: %s
            Ano de Ingresso: %d
            Curso: %s
            
            """, aluno1.matricula, aluno1.nome, aluno1.anoDeIngresso, aluno1.curso);

        System.out.printf("""
            Ano atual: %d
            """, aluno1.calculoDeTempo(2025));

        System.out.printf("""
            Mensalidade: %.2f""", aluno1.calcMensalidade(7));
    }
}