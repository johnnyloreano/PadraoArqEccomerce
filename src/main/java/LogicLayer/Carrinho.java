package LogicLayer;

import DataLayer.BoletoModel;
import DataLayer.ClienteModel;
import DataLayer.ProdutoModel;
import PersistenceLayer.BoletoPersistence;
import PersistenceLayer.ClientePersistence;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<ProdutoModel> carrinho;
    ClienteModel cliente;
    BoletoPersistence boletoPersistence;

    public Carrinho(ClienteModel cliente, BoletoPersistence boletoPersistence){
        this.carrinho = new ArrayList<ProdutoModel>();
        this.cliente = cliente;
        this.boletoPersistence = boletoPersistence;
    }

    public void addProductToCarrinho(ProdutoModel productModel){
        if(productModel == null) throw new NullPointerException("Produto nulo!");
        this.carrinho.add(productModel);
    }

    public BoletoModel gerarBoleto(){

        BoletoModel novoBoleto = new BoletoModel(carrinho,0,this.cliente.getCpf());
        this.boletoPersistence.addBoleto(novoBoleto);

        return novoBoleto;

    }

    public String toString(){
        if(this.carrinho.size() == 0) return "O carrinho está vazio.";
        String message = new String("Produtos no carrinho.\n");
        for(ProdutoModel produtoModel: carrinho){
            message += produtoModel.toString() + "\n";
        }
        return message;
    }


}