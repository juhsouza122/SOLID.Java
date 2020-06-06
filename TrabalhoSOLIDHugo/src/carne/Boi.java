package carne;

import ramenshop.Pedido;

public class Boi extends Carne{
	
	private final Pedido pedido;
	
	public Boi(Pedido pedido) {
		this.pedido = pedido;
	}
	
	@Override
	public String getDescricao() {
		return pedido.getDescricao() + "\nBoi -------- +7.90";
	}
	
	@Override
	public double getPreco() {
		return pedido.getPreco() + 7.90;
	}
}
