package tests;

import domain.Livro;

public class LivroTest
{
    public static void main(String[] args) {

        Livro aluno1 = new Livro("Fulano", "Sicrano", 80, 1, 2024);

        aluno1.imprimeLivro();
        aluno1.precoVendaLivro(10);
    }

}