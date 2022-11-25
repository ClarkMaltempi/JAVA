
import java.util.ArrayList;

public class Pedido extends Cliente {
	
	private int id;
	private Cliente cliente;
	private ArrayList<ItemPedido> lista;
	
	Pedido(){}
	
	Pedido(int id, Cliente cliente, ArrayList<ItemPedido> listaProdutos){
		
		this.id =id;
		this.cliente = cliente;
		this.lista = listaProdutos;	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ArrayList<ItemPedido> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ItemPedido> lista) {
		this.lista = lista;
	}

}
