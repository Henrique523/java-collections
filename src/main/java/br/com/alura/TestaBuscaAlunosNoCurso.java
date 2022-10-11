package br.com.alura;

public class TestaBuscaAlunosNoCurso {
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

        System.out.println("Quem é o aluno com matrícula 5617?");
        Aluno aluno = colecoesJava.buscaMatriculado(5617);
        System.out.println("Aluno matriculado: " + aluno);
    }
}
