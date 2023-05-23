package Servico;

import Modelo.ModeloDeItem;

public class Estoque {
    //Jesus é o caminho, a verdade e a vida!!!
    private static ModeloDeItem[] items = new ModeloDeItem[0];

    public void verEstoque() {
        System.out.println("------------- ESTOQUE -------------");

        for (ModeloDeItem item:items) {
            System.out.println("----- Item " + item.getIdDoItem() + " -----");
            System.out.println("nome: " + item.getNome());
            System.out.println("valor: " + item.getValor() + "R$");
            System.out.println("quantidade: " + item.getQuantidade());
            System.out.println("tipo: " + item.getTipo());
        }
    }

    public void removerDoEstoque(int id) {
        if (this.includes(id)) {
            ModeloDeItem.setId(ModeloDeItem.getId() - 1);
            ModeloDeItem[] novoItems = new ModeloDeItem[Estoque.items.length - 1];

            for (int i = 0; i < Estoque.items.length; i++) {
                if (Estoque.items[i].getIdDoItem() != id) {
                    novoItems[i] = Estoque.items[i];
                }
            }

            Estoque.items = novoItems;
        } else {
            System.out.println("[ERRO] Verifique as informações.");
        }
    }

    public void adicionarAoEstoque(ModeloDeItem item) {
        Estoque.items = adicionaAumArray(Estoque.items, item);
    }

    private ModeloDeItem[] adicionaAumArray(ModeloDeItem[] items, ModeloDeItem item) {
        ModeloDeItem[] novoItems = new ModeloDeItem[items.length + 1];

        if (items.length == 0) {
            novoItems[0] = item;
            return novoItems;
        } else {
            for (int i = 0; i < items.length; i++) {
                novoItems[i] = items[i];
            }

            novoItems[novoItems.length - 1] = item;
            return novoItems;
        }
    }

    private boolean includes(int id) {
        if (Estoque.items.length == 0) {
            return false;
        } else {
            for (ModeloDeItem item: Estoque.items) {
                if (item.getIdDoItem() == id) {
                    return true;
                }
            }
            return false;
        }
    }
}
