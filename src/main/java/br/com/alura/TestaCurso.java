package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso colecoesJava = new Curso("Dominando as coleções Java", "Guilherme");

        List<Aula> aulas = colecoesJava.getAulas();

        System.out.println(aulas);

        colecoesJava.adiciona(new Aula("Trabalhando com Arraylist", 21));

        System.out.println(aulas);

        System.out.println(colecoesJava.getAulas());
    }
}
