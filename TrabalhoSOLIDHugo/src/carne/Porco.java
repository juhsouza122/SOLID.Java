package carne;

import ramenshop.Pedido;

public class Porco extends Carne{
	
	private final Pedido pedido;
	
	public Porco(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nPorco -------- +5.90";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 5.90;
	}
}
