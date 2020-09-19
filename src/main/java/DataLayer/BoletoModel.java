package DataLayer;

import java.util.List;

public class BoletoModel{
    
    private List<ProdutoModel> listaProduto;
    private int idNotaFiscal;
    private String cpf;

    public BoletoModel(List<ProdutoModel> listaProduto, int idNotaFiscal, String cpf){
        this.listaProduto = listaProduto;
        this.idNotaFiscal = idNotaFiscal;
        this.cpf = cpf;
    }

    public void setIdProduto(List<ProdutoModel> listaProduto){
        this.listaProduto = listaProduto;
    }
    public void setIdNotaFiscal(int idNotaFiscal){
        this.idNotaFiscal = idNotaFiscal;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public List<ProdutoModel> getIdProduto(){
        return this.listaProduto;
    }
    public int getIdNotaFiscal(){
        return this.idNotaFiscal;
    }
    public float getValor(){
        float valorFinal = 0;
        for (ProdutoModel produtoModel: listaProduto) valorFinal += (produtoModel.getValor() * produtoModel.getQuantidade());
        return valorFinal;
    }
    public String getCpf(){
        return this.cpf;
    }
}