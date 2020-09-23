package PersistenceLayer;

import DataLayer.ClienteModel;
import DataLayer.ProdutoModel;

import java.util.ArrayList;
import java.util.List;

public class ProdutoPersistence {
    private static List<ProdutoModel> produtoList;

    public ProdutoPersistence() {
        this.produtoList = new ArrayList<ProdutoModel>();
        init();
    }

    public void init() {
        this.produtoList.add(new ProdutoModel(1, "Camisa", 300,10));
        this.produtoList.add(new ProdutoModel(2, "Bermuda", 200,15));
        this.produtoList.add(new ProdutoModel(3, "Jaqueta", 100,20));
    }

    public void addProduto(ProdutoModel newProduto){
        if(newProduto == null) throw new NullPointerException("Produto é nulo!");
        this.produtoList.add(newProduto);
    }

    public ProdutoModel getProdutoByID(int id) {
        if(id <= 0) throw new NullPointerException("Argumento nulo.");
        for (ProdutoModel produto : this.produtoList) {
            if(produto.getId() == id){
                return produto;
            }
        }
        return null;
    }

    public void printProductList() {
        for(ProdutoModel p : this.produtoList) {
            System.out.println(p.getId() + " - Produto: " + p.getNome() + " | Valor: R$ " + p.getValor() + " | Quantidade: " + p.getQuantidade());
        }
    }

    public void printProduct() {
        for(ProdutoModel p : this.produtoList) {
            System.out.print(p.getId() + " - " + p.getNome() + " | R$ " + p.getValor() + "\n");
        }
    }


}
