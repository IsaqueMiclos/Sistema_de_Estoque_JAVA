public class Test01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        ModeloDeItem item001 = new ModeloDeItem("Bananas",500,Classificacao.ALIMENTO_PERECIVEL, 100);
        ModeloDeItem item002 = new ModeloDeItem("Arroz",25,Classificacao.BEBIDA, 5);
        ModeloDeItem item003 = new ModeloDeItem("Arroz",25,Classificacao.BEBIDA, 5);
        ModeloDeItem item004 = new ModeloDeItem("Arroz",25,Classificacao.BEBIDA, 5);
        ModeloDeItem item005 = new ModeloDeItem("Arroz",25,Classificacao.BEBIDA, 5);

        Estoque estoque = new Estoque();
        estoque.adicionarAoEstoque(item001);
        estoque.adicionarAoEstoque(item002);
        estoque.adicionarAoEstoque(item003);
        estoque.adicionarAoEstoque(item004);
        estoque.adicionarAoEstoque(item005);
        estoque.verEstoque();
    }
}
