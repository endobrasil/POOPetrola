import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Aluno {
    private String area;
    private List<String> formacoes;
    private int aulasMinistradas; // contador de aulas dadas

    // Construtor
    public Professor(String nome, String curso, int idade, String area) {
        super(nome, curso, idade); // chama o construtor da classe Aluno
        this.area = area;
        this.formacoes = new ArrayList<>();
        this.aulasMinistradas = 0;       

    }

    // Getter e Setter para área
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // Métodos para formações
    public void adicionarFormacao(String formacao) {
        formacoes.add(formacao);
    }
    
    public String listarFormacoes() {
        String formac="";
        if (formacoes.isEmpty()) {
            formac+=("Nenhuma formação cadastrada.");
        } else {
            formac+=("Formações:");
            for (String f : formacoes) {
                formac+=("- " + f);
            }
        }
        return formac;
    }

    public String lecionarAula(String disciplina) {
        aulasMinistradas++;
        return "Professor " + this.getNome() + " lecionou a disciplina: " + disciplina;
    }

    //sobreescrevendo metodo da hora
        @Override
        public String hora(){
        LocalTime agora = LocalTime.now();
        int hora = agora.getHour();
    
        if (hora >= 5 && hora < 12) {
            return ("Bom Dia, ");
        } else if (hora >= 12 && hora < 18) {
            return ("Boa Tarde, ");
        } else {
            return ("Boa noite, ");
        }
    }

    @Override
    public String saudacao(Aluno aluno){
        String mensagem=this.hora();
        mensagem += "jovem "+aluno.getNome()+", você está radiane hj!";
        return mensagem;
    }



    // Sobrescrevendo o método exibirInformacoes
    @Override
    public String exibirInformacoes() {
        String info="";
        info+= super.exibirInformacoes(); // chama método da superclasse
        info+=(", Área de atuação: " + area);
        info+=listarFormacoes();
        info+=(", Aulas ministradas: " + aulasMinistradas);
        return info;
    }
}