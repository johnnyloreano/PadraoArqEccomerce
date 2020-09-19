package LogicLayer;

import java.util.ArrayList;

public class Carrinho {

    List<> carrinho;

    Carrinho(){
        this.carrinho = new ArrayList<>();
    }

    public void addProductToCarrinho(ProductModel productModel){
        if(productModel == null) throw NullPointerException("Produto nulo!");
        this.carrinho.add(productModel);
    }


}