public class Colaborador {

    // Atributos do colaborador
    private String nome;
    private String funcao;

    // Construtor da classe
    public Colaborador(String nome, String funcao) {

        this.nome = nome;
        this.funcao = funcao;

    }

    // Métodos getters e setters
    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public String getFuncao() {

        return funcao;

    }

    public void setFuncao(String funcao) {

        this.funcao = funcao;

    }

}
