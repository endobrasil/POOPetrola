import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String curso;
    private int idade;
    private List<String> aulasAssistidas;

    // Construtor
    public Aluno(String nome, String curso, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
        this.aulasAssistidas = new ArrayList<>();
         
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public int getIdade() {
        return idade;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para exibir informações do aluno
    public String exibirInformacoes() {
        String info="";
        info+=("Nome: " + nome);
        info+=(", Curso: " + curso);
        info+=(", Idade: " + idade);

        return info;
    }

    // Método para adicionar uma aula assistida
    public void adicionarAula(String aula) {
        aulasAssistidas.add(aula);
    }

     // Método para listar as aulas assistidas
     public String listarAulasAssistidas() {
        String aulas="";
        if (aulasAssistidas.isEmpty()) {
            aulas+=("Nenhuma aula assistida ainda.");
        } else {
            aulas+=("Aulas assistidas:");
            for (String aula : aulasAssistidas) {
                aulas+=("- " + aula);
            }
        }
        return aulas;
    }

    public String hora(){
        LocalTime agora = LocalTime.now();
    int hora = agora.getHour();

    if (hora >= 5 && hora < 12) {
        return ("Oh dia Bom ");
    } else if (hora >= 12 && hora < 18) {
        return ("ta calor, ");
    } else {
        return ("to com sono, ");
    }

    }
    
    public String saudacao() {
        String mensagem;
        mensagem = this.hora();
        return mensagem;
    }

    public String saudacao(Aluno aluno) {
        String mensagem=this.hora();
        mensagem += "né "+aluno.getNome();
        return mensagem;
    }

    public String saudacao(Professor professor) {
        String mensagem=this.hora();
        mensagem += "Sr. "+professor.getNome()+", Vc esta elegante hoje!";
        return mensagem;
 
}
}