public class Estoque {
    //Jesus é o caminho, a verdade e a vida!!!
    private static ModeloDeItem[] items = new ModeloDeItem[0];

    public void verEstoque() {
        System.out.println("----- ESTOQUE ----");

        for (ModeloDeItem item:items) {
            System.out.println("---- Item " + item.getIdDoItem() + " -----");
            System.out.println("nome: " + item.getNome());
            System.out.println("valor: " + item.getValor());
            System.out.println("quantidade: " + item.getQuantidade());
            System.out.println("tipo: " + item.getTipo());
        }
    }

    public void removerDoEstoque(int idDoItem) {

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
}
