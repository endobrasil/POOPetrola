

public class Principal{
    public static void main(String[] args) {
        // Criando um objeto Aluno & professor
        Aluno aluno1 = new Aluno("Maria", "Engenharia de Software", 21);
        Aluno aluno2 = new Aluno("Andre", "Deenvolviemtno", 39);

        Professor prof = new Professor("Ana", "Pedagogia", 35, "Educação Infantil");
        Professor prof2 = new Professor("Wendel", "Medicina", 39, "Saúde");

        // Exibindo as informações do aluno
        System.out.println("Informações iniciais:");
        System.out.println(aluno1.exibirInformacoes());
        

        // Modificando os dados do aluno
        aluno1.setNome("Maria Silva");
        aluno1.setCurso("Ciência da Computação");
        aluno1.setIdade(22);

        // Exibindo novamente após as mudanças
        System.out.println("\nInformações atualizadas:");
        aluno1.adicionarAula(prof.lecionarAula("Psicologia da Aprendizagem"));
        aluno1.adicionarAula(prof.lecionarAula("POO com Java"));
        aluno1.adicionarAula(prof.lecionarAula("Estruturas de Dados"));
        System.out.println(aluno1.saudacao());
        System.out.println(aluno1.saudacao(aluno2));
        System.out.println(aluno1.saudacao(prof));
        

        System.out.println(aluno1.exibirInformacoes()+"IMPRIMILALALALALLALALA");
        


        System.out.println("\n\n\n\n\n#########Teste da classe professor ");
        /*Teste da classe professor */

        

        System.out.println(prof.saudacao()); // herdado da classe Aluno
        System.out.println(prof.saudacao(aluno1));
        System.out.println(prof.saudacao(prof2));

        // Exibir informações iniciais
        prof.exibirInformacoes();
        

        // Adicionando aulas assistidas (herdado de Aluno)
        prof.adicionarAula("Didática");
        prof.adicionarAula("Psicologia da Educação");

        // Adicionando formações
        prof.adicionarFormacao("Licenciatura em Pedagogia");
        prof.adicionarFormacao("Mestrado em Educação");

        System.out.println("\nInformações após atualizações:");
        prof.exibirInformacoes();
        

        
    }
}


