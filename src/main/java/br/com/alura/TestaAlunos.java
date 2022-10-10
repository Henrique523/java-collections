package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<String>();
        alunos.add("Rodrigo");
        alunos.add("Roberto");
        alunos.add("Nico");
        alunos.add("Sergio");
        alunos.add("Renan");
        alunos.add("Mauricio");

        boolean pauloEstaMatriculado = alunos.contains("Paulo");
        alunos.remove("Sergio");
        System.out.println(pauloEstaMatriculado);

        for (String aluno: alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(System.out::println);

        System.out.println(alunos);
    }
}
