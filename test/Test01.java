package test;

import Modelo.Classificacao;
import Modelo.ModeloDeItem;
import Servico.Estoque;

public class Test01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        estoque.adicionarAoEstoque(new ModeloDeItem("Feijão",25,Classificacao.ALIMENTO_NAO_PERECIVEL,25,"KG"));
        estoque.adicionarAoEstoque(new ModeloDeItem("Arroz",30,Classificacao.ALIMENTO_NAO_PERECIVEL,5, "KG"));
        estoque.verEstoque();
    }
}
