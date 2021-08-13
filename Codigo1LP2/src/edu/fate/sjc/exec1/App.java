package edu.fate.sjc.exec1;

//import lombok.Builder;
import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;

public class App {
    
    public static void main(String[] args) throws Exception {

        Editora edit = Editora.builder().name("Abril").build();
        System.out.println("Nome da editora " + edit.getName() + ".");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        Professor prof = Professor.builder().teacheRegister(1)
                                            .department("TI")
                                            .build();
        System.out.println("Número de registro do professor : " + prof.getTeacheRegister() 
        + " e o seu departameto é -> " + prof.getDepartment() + ".");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Calendar c = Calendar.getInstance();
        c.set(2013, Calendar.FEBRUARY, 28);
        Date data = c.getTime();
        DateFormat formataData = DateFormat.getDateInstance();

        Funcionario func = Funcionario.builder().admissionDate(data)
        .department("Administração")
        .build();
        System.out.println("O funcionário foi admitido no dia, " + formataData.format(func.getAdmissionDate()) 
        + ", e o seu departameto é -> " + func.getDepartment() + ".");

        // nessa brincadeira mais pra frente trabalhar com lista
        func.registerWork("ObraTeste", 1);
        func.deleteWork(2);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Obra obr = Obra.builder()
        .genero("Juvenil")
        .idioma("Português")//
        .midia("Digital")//
        .nome("Desenvolvimento de jogos") //
        .anoPublicacao(2020) //
        .autor("João da Silva") //
        .editora(edit.getName())
        .build();

        System.out.println("Obra de nome " + obr.getNome() 
        + " criada pelo autor " + obr.getAutor() + " no ano de " + obr.getAnoPublicacao() 
        + " vendida na forma " + obr.getMidia() + " no idioma " + obr.getIdioma() 
        + " pela editora " + obr.getEditora() + ".");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Aluno alu = Aluno.builder()
        .RA("23556677")
        .course("Banco de dados")
        .build();

        System.out.println("Aluno portador do RA " + alu.getRA() 
        + " matriculado no curso de " + alu.getCourse() + ".");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        c.set(2015, Calendar.JUNE, 5);
        Date date = c.getTime();

        c.set(2015, Calendar.AUGUST, 10);
        Date date1 = c.getTime();

        Emprestimo empr = Emprestimo.builder()
        .loanDate(date)
        .returnDate(date1)
        .Atributte1("Atributte1")
        .build();

        System.out.println("A data na qual foi realizada o empréstimo foi, " + formataData.format(empr.getLoanDate()) 
        + " e sua data de devolução é " + formataData.format(empr.getReturnDate()) + " " +empr.getAtributte1() + ".");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        Autor aut = Autor.builder()
        .name("José Monteriro")
        .nationality("Brasileiro")
        .build();

        System.out.println("Nome do autor: " + aut.getName() + " / " + aut.getNationality() + ".");

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        c.set(1997, Calendar.JULY, 22);
        Date date3 = c.getTime();
        
        Usuario usu = Usuario.builder()
        .name("")
        .adress("adress")
        .cpf("cpf")
        .birthDate(date3)
        .build();

         // nessa brincadeira mais pra frente trabalhar com lista
         usu.consultWork(obr.getNome() , obr.getAnoPublicacao());
         usu.reserveWork(obr.getNome());
         usu.lendWork(obr.getNome());


    }
}

