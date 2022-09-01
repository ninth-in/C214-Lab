package exp;

public class Professor {

    private String nomeDoProfessor;
    private String horarioDeAtendimento;
    private String periodo;

    public Professor (String nomeDoProfessor, String horarioDeAtendimento, String periodo){
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
    }

    public String getNome() {
        return nomeDoProfessor;
    }

    public void setNome(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getHorario() {
        return horarioDeAtendimento;
    }

    public void setHorario(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}