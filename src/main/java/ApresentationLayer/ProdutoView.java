package ApresentationLayer;

import DataLayer.ProdutoModel;

public class ProdutoView {
    ProdutoModel produtoModel;

    ProdutoView(ProdutoModel produtoModel) {
        if(produtoModel == null) throw new NullPointerException("Produto é nulo!");
            this.produtoModel = produtoModel;
    }

    public void setProdutoModel(ProdutoModel produtoModel){
        this.produtoModel = produtoModel;
    }

    public void getProdutoInfo() {
        System.out.println("Nome do cliente: \t" + this.produtoModel.getNome());
        System.out.println("Quantidade: \t" + this.produtoModel.getQuantidade());
    }
}
