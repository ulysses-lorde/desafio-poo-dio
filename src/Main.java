import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso kotlin");
        curso2.setDescricao("Descricao curso kotlin");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp TQI");
        bootcamp.setDescricao("Descricao Bootcamp TQI");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devUlysses = new Dev();
        devUlysses.setNome("Ulysses");
        devUlysses.inscreverBootcamp(bootcamp);
        devUlysses.progredir();
        devUlysses.progredir();
        System.out.println("--");
        System.out.println("Conteudos Inscritos Ulysses: " + devUlysses.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Ulysses: " + devUlysses.getConteudosConcluidos());
        System.out.println("XP: " + devUlysses.calcularTotalXp());

        System.out.println("--------------------");

        Dev novoDev = new Dev();
        System.out.println("Digite Seu Nome: ");
        novoDev.setNome(scanner.nextLine());
        System.out.println("Nome do Dev: " + novoDev.getNome());
        //novoDev.inscreverBootcamp(bootcamp);
        System.out.printf("Conteudos Inscritos %s: %s\n", novoDev.getNome(), novoDev.getConteudosInscritos());
        novoDev.progredir();
        //System.out.println("Concluidos: " + novoDev.getConteudosConcluidos());
    }
}
