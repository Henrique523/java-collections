package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso colecoesJava = new Curso("Dominando as coleções Java", "Guilherme");

        List<Aula> aulasImutaveis = colecoesJava.getAulas();
        System.out.println(aulasImutaveis);

        colecoesJava.adiciona(new Aula("Trabalhando com Arraylist", 21));

        List<Aula> aulas = new ArrayList<Aula>(aulasImutaveis);

        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(colecoesJava.getTempoTotal());
        System.out.println(colecoesJava);
    }
}
