package PersistenceLayer;

import DataLayer.BoletoModel;
import DataLayer.ProdutoModel;

import java.util.ArrayList;
import java.util.List;

public class BoletoPersistence {
    private List<BoletoModel> boletoList;

    BoletoPersistence(List<BoletoModel> list ) {
        this.boletoList = list;
    }

    public void init() {
        List<ProdutoModel> listaProduto = new ArrayList<ProdutoModel>();
        listaProduto.add(new ProdutoModel(1, "Camisa", 3,10));
        listaProduto.add(new ProdutoModel(3, "Jaqueta", 1,20));

        this.boletoList.add(new BoletoModel(listaProduto, 1, "123"));
        this.boletoList.add(new BoletoModel(listaProduto, 2, "321"));
        this.boletoList.add(new BoletoModel(listaProduto, 3, "855"));
    }

    public void addBoleto(BoletoModel newBoleto){
        if(newBoleto == null) throw new NullPointerException("Boleto é nulo!");
        this.boletoList.add(newBoleto);
    }

    public BoletoModel getBoletoByID(int id) {
        if(id <= 0) throw new NullPointerException("Argumento nulo.");
        for (BoletoModel boletoModel : this.boletoList) {
            if(boletoModel.getIdNotaFiscal() == id)
            return boletoModel;
        }
        return null;
    }

}
