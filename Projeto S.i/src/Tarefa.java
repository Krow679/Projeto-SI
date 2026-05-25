public class Tarefa {

    // Atributos da tarefa
    private String descricao;
    private String status;

    // Construtor da classe
    public Tarefa(String descricao, String status) {

        this.descricao = descricao;
        this.status = status;

    }

    // Métodos getters e setters
    public String getDescricao() {

        return descricao;

    }

    public void setDescricao(String descricao) {

        this.descricao = descricao;

    }

    public String getStatus() {

        return status;

    }

    public void setStatus(String status) {

        this.status = status;

    }

}
