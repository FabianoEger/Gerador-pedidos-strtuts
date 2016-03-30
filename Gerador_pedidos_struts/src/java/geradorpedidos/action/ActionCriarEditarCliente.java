package geradorpedidos.action;

import geradorpedidos.dao.ClienteDAO;
import geradorpedidos.model.Cliente;
import java.util.List;

/**
 *
 * @author fabiano.eger
 */
public class ActionCriarEditarCliente {
    private String id;
    private String nome, email, mensagem;
    private Cliente cliente;
    private List<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getMensagem() {
        return mensagem;
    }
    
    public String execute() throws Exception {		
		ClienteDAO dao = new ClienteDAO();
		
		if ((id != null) && (!id.equals("")) && (!id.equals("0"))) {
			int idCliente = Integer.parseInt(id);
			cliente.setIdCliente(idCliente);
			dao.atualizar(cliente);
			
			mensagem = "Contato alterado com sucesso.";
		} else {
			dao.inserir(cliente);
			mensagem = "Contato criado com sucesso";
		}
		
		setClientes(dao.getClientes());
				
		return "success";
	}

    /**
     * @return the clientes
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
