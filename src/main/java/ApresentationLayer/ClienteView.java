package ApresentationLayer;

import DataLayer.ClienteModel;

public class ClienteView {

    ClienteModel clienteModel;

    ClienteView(ClienteModel clienteModel){
        if(clienteModel == null) throw new NullPointerException("Cliente é nulo!");
        this.clienteModel = clienteModel;
    }

    public void setClienteModel(ClienteModel clienteModel) {
        this.clienteModel = clienteModel;
    }

    public void getClienteInfo(){
        System.out.println("Nome do cliente: \t" + this.clienteModel.getNome());
        System.out.println("CPF do cliente: \t" + this.clienteModel.getCpf());
        System.out.println("Endereço do cliente: \t" + this.clienteModel.getEndereco());
    }

}
