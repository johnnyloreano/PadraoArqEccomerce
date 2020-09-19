package LogicLayer;

import DataLayer.ClienteModel;
import PersistenceLayer.ClientePersistence;

public class ClienteController {

    private ClientePersistence clientePersistence;
    ClienteController(ClientePersistence clientePersistence){
        this.clientePersistence = clientePersistence;
    }

    public ClienteModel getClienteByCPF(ClienteModel clienteModel){

        ClienteModel resultCliente = clientePersistence.getClienteByCPF(clienteModel.getCpf());
        if(resultCliente == null)
            throw new NullPointerException("Cliente não encontrado!");
        return resultCliente;

    }

    public void cadastraCliente(ClienteModel newCliente){

        this.clientePersistence.addCliente(newCliente);

    }

}