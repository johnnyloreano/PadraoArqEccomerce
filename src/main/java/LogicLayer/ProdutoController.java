package LogicLayer;

import DataLayer.ProdutoModel;
import PersistenceLayer.ProdutoPersistence;

public class ProdutoController {
    private ProdutoPersistence produtoPersistence;
    ProdutoController(ProdutoPersistence produtoPersistence) { this.produtoPersistence = produtoPersistence; }

    public void cadastraProduto(ProdutoModel newProduto) {
       this.produtoPersistence.addProduto(newProduto);
    }

    public ProdutoModel getProduto(ProdutoModel produtoModel) {
        ProdutoModel resultProduto = produtoPersistence.getProdutoByID(produtoModel.getId());
        if(resultProduto == null) {
            throw new NullPointerException("Produto não encontrado!");
        }
        return resultProduto;
    }
}
