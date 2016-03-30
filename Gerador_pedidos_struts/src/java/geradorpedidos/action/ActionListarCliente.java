package geradorpedidos.action;

import geradorpedidos.dao.ClienteDAO;
import geradorpedidos.model.Cliente;
import java.util.List;

/**
 *
 * @author fabiano.eger
 */
public class ActionListarCliente {
    private List<Cliente> clientes;

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
	
	public String execute() throws Exception {
		
		ClienteDAO dao = new ClienteDAO();
		setClientes(dao.getClientes());
		
		return "success";
	}
}
