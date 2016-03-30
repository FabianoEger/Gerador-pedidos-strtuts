/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geradorpedidos.action;

import geradorpedidos.dao.ClienteDAO;
import geradorpedidos.model.Cliente;

/**
 *
 * @author fabiano.eger
 */
public class ActionFormEditarCliente {

    private Cliente cliente;
    private String id;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String execute() throws Exception {
        cliente = new Cliente();
        
        if (id != null) {
            int idCliente = Integer.parseInt(id);
            ClienteDAO dao = new ClienteDAO();
            cliente = dao.getClienteById(idCliente);
        }

        return "success";
    }

}
