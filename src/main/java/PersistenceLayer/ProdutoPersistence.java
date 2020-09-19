package PersistenceLayer;

import DataLayer.ProdutoModel;

import java.util.List;

public class ProdutoPersistence {
    private List<ProdutoModel> produtoList;

    ProdutoPersistence(List<ProdutoModel> list ) {
        this.produtoList = list;
    }

    public void init() {
        this.produtoList.add(new ProdutoModel(1, "Camisa", 3));
        this.produtoList.add(new ProdutoModel(2, "Bermuda", 2));
        this.produtoList.add(new ProdutoModel(3, "Jaqueta", 1));
    }

    public void addProduto(ProdutoModel newProduto){
        if(newProduto == null) throw new NullPointerException("Produto é nulo!");
        this.produtoList.add(newProduto);
    }

    public ProdutoModel getProdutoByID(int id) {
        if(id == 0) throw new NullPointerException("Argumento nulo.");
        for (ProdutoModel produto : this.produtoList) {
            if(produto.getId() == id){
                return produto;
            }
        }
    }

}
