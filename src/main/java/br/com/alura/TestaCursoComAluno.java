package br.com.alura;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso colecoesJava = new Curso("Dominando as coleções Java", "Guilherme");

        colecoesJava.adiciona(new Aula("Trabalhando com Arraylist", 21));
        colecoesJava.adiciona(new Aula("Criando uma aula", 20));
        colecoesJava.adiciona(new Aula("Modelando com coleções", 25));

        Aluno a1 = new Aluno("Rodrigo Turini", 34681);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aiche", 17645);

        colecoesJava.matricula(a1);
        colecoesJava.matricula(a2);
        colecoesJava.matricula(a3);

        Set<Aluno> alunos = colecoesJava.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator();

        while(iterador.hasNext()) {
            Aluno aluno = iterador.next();
            System.out.println(aluno);
        }

        Vector<Aluno> vetor = new Vector<>();

        System.out.println("Todos os alunos matriculados: ");

        colecoesJava.getAlunos().forEach(System.out::println);

        System.out.println(colecoesJava.estaMatriculado(a1));

        Aluno turini = new Aluno("Rodrigo Turini", 34681);
        System.out.println(colecoesJava.estaMatriculado(turini)); // FALSE
    }
}
