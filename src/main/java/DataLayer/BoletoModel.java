public class BoletoModel{
    
    private int idProduto;
    private int idNotaFiscal;
    private Double valor;
    private String cpf;

    public BoletoModel(int idProduto, int idNotaFiscal, String cpf, Double valor){
        this.idNotaFiscal = idProduto;
        this.idNotaFiscal = idNotaFiscal;
        this.valor = valor;
        this.cpf = cpf;
    }

    public void setIdProduto(int idProduto){
        this.idProduto = idProduto;
    }
    public void setIdNotaFiscal(int idNotaFiscal){
        this.idNotaFiscal = idNotaFiscal;
    }
    public void getValor (String valor){
        this.valor = valor;
    }
    public void getCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdProduto(){
        return this.idProduto;
    }
    public int getIdNotaFiscal(){
        return this.idNotaFiscal;
    }
    public String getValor(){
        return this.valor;
    }
    public String getCpf(){
        return this.cpf;
    }
}