package PersistenceLayer;

import DataLayer.ClienteModel;

import java.util.List;

public class ClientePersistence {

    private List<ClienteModel> clientList;

    ClientePersistence(List<ClienteModel> list){
        this.clientList = list;
    }
    public void init(){
        this.clientList.add(new ClienteModel("John", "123", "Brazil"));
        this.clientList.add(new ClienteModel("Mary", "855", "Swiss"));
        this.clientList.add(new ClienteModel("Doe", "902", "Chile"));
        this.clientList.add(new ClienteModel("Luka", "012", "Czech"));
        this.clientList.add(new ClienteModel("Kevin", "321", "Brazil"));
    }
    public ClienteModel getClienteByCPF(String cpf){
        if(cpf == null) throw new NullPointerException("CPF usado como argumento é nulo");
        for (ClienteModel client : this.clientList){
            if(client.getCpf().equals(cpf)) return client;
        }
        return null;
    }

    public void addCliente(ClienteModel newClient){
        if(newClient == null) throw new NullPointerException("Cliente usado como argumento é nulo");
        this.clientList.add(newClient);
    }

}