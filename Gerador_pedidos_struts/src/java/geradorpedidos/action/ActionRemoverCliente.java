/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorpedidos.action;

import geradorpedidos.dao.ClienteDAO;
import geradorpedidos.model.Cliente;
import java.util.List;

/**
 *
 * @author fabiano.eger
 */
public class ActionRemoverCliente {

    private String id;
    private String mensagem;
    private List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    

    public String getMensagem() {
        return mensagem;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String execute() throws Exception {
        ClienteDAO dao = new ClienteDAO();

        if (id != null) {
            int idCliente = Integer.parseInt(id);
            Cliente cliente = new Cliente();
            cliente.setIdCliente(idCliente);
            dao.remover(idCliente);
            mensagem = "Contato removido com sucesso.";
        } else {
            mensagem = "Erro ao remover contato. ID não pode ser nulo.";
        }

       setClientes(dao.getClientes());
        return "success";
    }

}
