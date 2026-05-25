public class Projeto {

    // Atributos da classe
    private String nome;
    private String prazo;

    // Construtor da classe
    public Projeto(String nome, String prazo) {

        this.nome = nome;
        this.prazo = prazo;

    }

    // Métodos getters e setters
    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getPrazo() {

        return prazo;

    }

    public void setPrazo(String prazo) {

        this.prazo = prazo;

    }

    // Método para exibir os dados do projeto
    @Override
    public String toString() {

        return "Projeto: " + nome + " | Prazo: " + prazo;

    }

}