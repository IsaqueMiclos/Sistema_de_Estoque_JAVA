package Modelo;

public class ModeloDeItem {
    //Jesus é o caminho, a verdade e a vida!!!
    private String nome;
    private static int id = 0;
    private int idDoItem;
    private double valor;
    private Classificacao tipo;
    private int quantidade;
    private String complemento;

    public ModeloDeItem() {

    }

    public ModeloDeItem(String nome, double valor, Classificacao tipo, int quantidade, String complemento) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
        this.complemento = complemento;
        this.idDoItem = id + 1;
        id = this.idDoItem;
    }

    public ModeloDeItem(String nome, double valor, Classificacao tipo, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
        this.tipo = tipo;
        this.valor = valor;
        this.idDoItem = id + 1;
        id = this.idDoItem;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        ModeloDeItem.id = id;
    }

    public int getIdDoItem() {
        return idDoItem;
    }

    public void setIdDoItem(int idDoItem) {
        this.idDoItem = idDoItem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Classificacao getTipo() {
        return tipo;
    }

    public void setTipo(Classificacao tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
