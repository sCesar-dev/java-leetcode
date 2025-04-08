package domain;

public class Aluno
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    public int matricula, anoDeIngresso, qtdDisciplinasMatr;
    public String nome, curso;
    public boolean matriculado;

    public void criarAluno( int matricula, String nome, int anoDeIngresso, String curso)
    {
        this.matricula = matricula;
        this.nome = nome;
        this.anoDeIngresso = anoDeIngresso;
        this.curso = curso;
    }

    public int calculoDeTempo(int anoAtual)
    {
        return anoAtual - anoDeIngresso;
    }

    public float calcMensalidade(float nrDisciplinas)
    {
        return nrDisciplinas * 150;
    }
}
