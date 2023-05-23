package test;

import Modelo.Classificacao;
import Modelo.ModeloDeItem;
import Servico.Estoque;

public class Test01 {
    //Jesus é o caminho, a verdade e a vida!!!
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        ModeloDeItem itemTest = new ModeloDeItem("Maçã", 25.40, Classificacao.ALIMENTO_PERECIVEL, 1000);
        ModeloDeItem itemTest02 = new ModeloDeItem("Maçã", 25.40, Classificacao.ALIMENTO_PERECIVEL, 1000);
        ModeloDeItem itemTest03 = new ModeloDeItem("Maçã", 25.40, Classificacao.ALIMENTO_PERECIVEL, 1000);
        estoque.adicionarAoEstoque(itemTest);
        estoque.adicionarAoEstoque(itemTest02);
        estoque.adicionarAoEstoque(itemTest03);
        estoque.verEstoque();
        estoque.removerDoEstoque(2);
        estoque.removerDoEstoque(3);
        estoque.verEstoque();
    }
}
