package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrdemStatus;

public class Ordem {
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date momento;
	private OrdemStatus status;

	private Cliente cliente;
	List<OrdemPedido> ordem = new ArrayList<>();

	public Ordem() {
	}

	public Ordem(Date momento, OrdemStatus status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void adicionaItem(OrdemPedido item) {
		ordem.add(item);
	}

	public void removeItem(OrdemPedido item) {
		ordem.remove(item);
	}

	public double total() {
		double sum = 0;
		for (OrdemPedido x : ordem) {
			sum += x.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hora da compra:");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status do pedido:");
		sb.append(status + "\n");
		sb.append("Cliente:");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:" + "\n");
		for (OrdemPedido x : ordem) {
			sb.append(x + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}
