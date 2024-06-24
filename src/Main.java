import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
       Curso curso1 = new Curso();
       curso1.setTitulo("Abstração");
       curso1.setDescricao("Descrição do curso Abstração");
       curso1.setCargaHoraria(8);

       Curso curso2 = new Curso();
       curso2.setTitulo("Encapsulamento");
       curso2.setDescricao("Descrição do curso Encapsulamento");
       curso2.setCargaHoraria(8);

       Curso curso3 = new Curso();
       curso3.setTitulo("Herança");
       curso3.setDescricao("Descrição do curso Herança");
       curso3.setCargaHoraria(8);

       Curso curso4 = new Curso();
       curso4.setTitulo("Polimorfismo");
       curso4.setDescricao("Descrição do curso Polimorfismo");
       curso4.setCargaHoraria(8);

       //polimorfismo
       //Conteudo conteudo = new Curso();

       Mentoria mentoria1 = new Mentoria();
       mentoria1.setTitulo("Mentoria Java");
       mentoria1.setDescricao("Descrição da mentoria");
       mentoria1.setData(LocalDate.now());

       //System.out.println(curso1);
       //System.out.println(mentoria1);

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("Bootcamp Java: Paradigma de Programação Orientada a Objetos");
       bootcamp.setDescricao("Descrição Bootcamp Java POO");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(curso3);
       bootcamp.getConteudos().add(curso4);
       bootcamp.getConteudos().add(mentoria1);

       Dev devAna = new Dev();
       devAna.setNome("Ana");
       devAna.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos inscritos de Ana: " + devAna.getConteudosInscritos());
       devAna.progredir();
       devAna.progredir();
       System.out.println("Conteudos concluídos de Ana: " + devAna.getConteudosConcluidos());
       System.out.println("Total de XP de Ana: " + devAna.calcularTotalXp());

       Dev devJoao = new Dev();
       devJoao.setNome("João");
       devJoao.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos inscritos de João: " + devJoao.getConteudosInscritos());
       devJoao.progredir();
       System.out.println("Conteudos concluídos de João: " + devJoao.getConteudosConcluidos());
       System.out.println("Total de XP de João: " + devJoao.calcularTotalXp());

    }
}
