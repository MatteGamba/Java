package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Acquisto {

	private int id;
	private LocalDate data;
	private List<Prodotto> prodotto;
	private Cliente cliente;
	
	public Acquisto() {
		this.prodotto = new ArrayList<Prodotto>();
	}

	public Acquisto(int id, Cliente cliente, LocalDate data) {
		this.id = id;
		this.cliente = cliente;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Prodotto> getProdotto() {
		return prodotto;
	}

	public void setProdotto(List<Prodotto> prodotto) {
		this.prodotto = prodotto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Acquisto [id=");
		builder.append(id);
		builder.append(", prodotto=");
		builder.append(prodotto);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append(", data=");
		builder.append(data);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}


